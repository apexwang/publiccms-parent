package com.publiccms.views.directive.cms;

// Generated 2015-5-10 17:54:56 by com.publiccms.common.source.SourceGenerator

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.publiccms.common.base.AbstractTemplateDirective;
import com.publiccms.common.handler.PageHandler;
import com.publiccms.common.handler.RenderHandler;
import com.publiccms.common.tools.CommonUtils;
import com.publiccms.entities.sys.SysSite;
import com.publiccms.logic.component.site.StatisticsComponent;
import com.publiccms.logic.service.cms.CmsContentService;

/**
 *
 * CmsSearchDirective
 * 
 */
@Component
public class CmsSearchDirective extends AbstractTemplateDirective {

    @Override
    public void execute(RenderHandler handler) throws IOException, Exception {
        String word = handler.getString("word");
        Long[] tagIds = handler.getLongArray("tagId");
        String[] dictionaryValues = handler.getStringArray("dictionaryValues");
        if (CommonUtils.notEmpty(word) || CommonUtils.notEmpty(tagIds) || CommonUtils.notEmpty(dictionaryValues)) {
            SysSite site = getSite(handler);
            if (CommonUtils.notEmpty(word)) {
                statisticsComponent.search(site.getId(), word);
            }
            if (CommonUtils.notEmpty(tagIds)) {
                for (Long tagId : tagIds) {
                    statisticsComponent.searchTag(tagId);
                }
            }
            PageHandler page;
            Integer pageIndex = handler.getInteger("pageIndex", 1);
            Integer count = handler.getInteger("count", 30);
            Date currentDate = CommonUtils.getMinuteDate();
            try {
                page = service.query(handler.getBoolean("projection", false), site.getId(), word, tagIds, dictionaryValues,
                        handler.getInteger("categoryId"), handler.getBoolean("containChild"),
                        handler.getIntegerArray("categoryIds"), handler.getStringArray("modelIds"),
                        handler.getDate("startPublishDate"), currentDate, currentDate, handler.getString("orderField"), pageIndex,
                        count);
            } catch (Exception e) {
                page = new PageHandler(pageIndex, count, 0, null);
            }
            handler.put("page", page).render();
        }
    }

    @Autowired
    private StatisticsComponent statisticsComponent;
    @Autowired
    private CmsContentService service;

}