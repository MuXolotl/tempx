package androidx.car.app.model;

import defpackage.AbstractC10066l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC6819l;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class TabTemplate implements InterfaceC11389l {
    private final String mActiveTabContentId;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final InterfaceC6819l mTabCallbackDelegate;
    private final TabContents mTabContents;
    private final List<Tab> mTabs;

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = Collections.EMPTY_LIST;
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabTemplate)) {
            return false;
        }
        TabTemplate tabTemplate = (TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents) && Objects.equals(this.mActiveTabContentId, tabTemplate.getActiveTabContentId());
    }

    public String getActiveTabContentId() {
        String str = this.mActiveTabContentId;
        Objects.requireNonNull(str);
        return str;
    }

    public Action getHeaderAction() {
        Action action = this.mHeaderAction;
        Objects.requireNonNull(action);
        return action;
    }

    public InterfaceC6819l getTabCallbackDelegate() {
        InterfaceC6819l interfaceC6819l = this.mTabCallbackDelegate;
        Objects.requireNonNull(interfaceC6819l);
        return interfaceC6819l;
    }

    public TabContents getTabContents() {
        TabContents tabContents = this.mTabContents;
        Objects.requireNonNull(tabContents);
        return tabContents;
    }

    public List<Tab> getTabs() {
        List<Tab> list = this.mTabs;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "TabTemplate";
    }

    public TabTemplate(AbstractC10066l abstractC10066l) {
        throw null;
    }
}
