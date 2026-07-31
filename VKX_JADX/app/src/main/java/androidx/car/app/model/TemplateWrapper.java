package androidx.car.app.model;

import defpackage.AbstractC0653l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private String mId;
    private boolean mIsRefresh;
    private InterfaceC11389l mTemplate;
    private List<TemplateInfo> mTemplateInfoForScreenStack;

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }

    public static TemplateWrapper copyOf(TemplateWrapper templateWrapper) {
        TemplateWrapper templateWrapperWrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        templateWrapperWrap.setRefresh(templateWrapper.isRefresh());
        templateWrapperWrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        List<TemplateInfo> templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            templateWrapperWrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return templateWrapperWrap;
    }

    private static String createRandomId() {
        return UUID.randomUUID().toString();
    }

    public static TemplateWrapper wrap(InterfaceC11389l interfaceC11389l, String str) {
        Objects.requireNonNull(interfaceC11389l);
        Objects.requireNonNull(str);
        return new TemplateWrapper(interfaceC11389l, str);
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public String getId() {
        String str = this.mId;
        Objects.requireNonNull(str);
        return str;
    }

    public InterfaceC11389l getTemplate() {
        InterfaceC11389l interfaceC11389l = this.mTemplate;
        Objects.requireNonNull(interfaceC11389l);
        return interfaceC11389l;
    }

    public List<TemplateInfo> getTemplateInfosForScreenStack() {
        List<TemplateInfo> list = this.mTemplateInfoForScreenStack;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(InterfaceC11389l interfaceC11389l) {
        this.mTemplate = interfaceC11389l;
    }

    public void setTemplateInfosForScreenStack(List<TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[template: ");
        sb.append(this.mTemplate);
        sb.append(", ID: ");
        return AbstractC0653l.ads(sb, this.mId, "]");
    }

    public static TemplateWrapper wrap(InterfaceC11389l interfaceC11389l) {
        return wrap(interfaceC11389l, createRandomId());
    }

    private TemplateWrapper(InterfaceC11389l interfaceC11389l, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = interfaceC11389l;
        this.mId = str;
    }
}
