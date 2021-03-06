/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 ‭‭‭‭‭‭‭‭‭‭‭‭[smallbun] www.smallbun.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
$(function () {
    //@formatter:off
    var options = {
        url: contextPath + 'dict/type/page',
        createUrl: contextPath + "dict/type/form",
        updateUrl: contextPath + "dict/type/form/{id}",
        removeUrl: contextPath + "dict/type/removeById",
        batRemoveUrl: contextPath + "dict/type/removeByIds",
        exportUrl: contextPath + "dict/type/export",
        importTemUrl: contextPath + "dict/type/import template download",
        sortName: "gmtCreate",
        sortOrder: "desc",
        modalName: "字典",
        search: false,
        showExport: false,
        showRefresh: true,
        showColumns: true,
        showToggle: true,
        columns: [{checkbox: true},
            {field: 'id', visible: false},
            {field: 'typeName', title: '字典名称', formatter: $.table.view, sortable: true},
            {field: 'typeCode', title: '字典类型', sortable: true},
            {field: 'gmtModified', title: '更新时间', sortable: true},
            {
                title: '操作', align: 'center', width: 50, visible: true, formatter: function (value, row, index) {
                    var actions = [];
                    actions.push('<div class="btn-group"><button type="button" class="btn ibtn-primary btn-xs dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-cog"></i>&nbsp;<span class="fa fa-chevron-down"></span></button>' +
                        '<ul class="dropdown-menu" role="menu">' +
                        '<li><a href="#" onclick="$.operate.view(\'' + row.id + '\',\'\')"><i class="fa fa-search-plus"></i>查看</a></li>' +
                        '<li><a href="#" onclick="$.operate.edit(\'' + row.id + '\')"><i class="fa fa-edit"></i>修改</a></li>' +
                        '<li><a href="#" onclick="$.operate.remove(\'' + row.id + '\')"><i class="fa fa-trash"></i>删除</a></li>' +
                        '<li><a href="#" onclick="$.modal.openTab(\'sys_dict_type' + row.id + '\', \'字典值\', \'dict/value?sysDictType.id=' + row.id + '\')"><i class="fa fa-plus"></i>字典值</a></li>' +
                        '</ul>' +
                        '</div>');
                    return actions.join('');
                }
            }]
    };
    $.table.init(options);
    //@formatter:off
});
