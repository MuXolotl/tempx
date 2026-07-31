package androidx.car.app.model;

import defpackage.AbstractC15991l;
import defpackage.InterfaceC10762l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class SearchTemplate implements InterfaceC11389l {
    private final ActionStrip mActionStrip;
    private final Action mHeaderAction;
    private final String mInitialSearchText;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final InterfaceC10762l mSearchCallbackDelegate;
    private final String mSearchHint;
    private final boolean mShowKeyboardByDefault;

    private SearchTemplate() {
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mSearchCallbackDelegate = null;
        this.mShowKeyboardByDefault = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTemplate)) {
            return false;
        }
        SearchTemplate searchTemplate = (SearchTemplate) obj;
        return this.mIsLoading == searchTemplate.mIsLoading && Objects.equals(this.mInitialSearchText, searchTemplate.mInitialSearchText) && Objects.equals(this.mSearchHint, searchTemplate.mSearchHint) && Objects.equals(this.mItemList, searchTemplate.mItemList) && Objects.equals(this.mHeaderAction, searchTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public InterfaceC10762l getSearchCallbackDelegate() {
        InterfaceC10762l interfaceC10762l = this.mSearchCallbackDelegate;
        Objects.requireNonNull(interfaceC10762l);
        return interfaceC10762l;
    }

    public String getSearchHint() {
        return this.mSearchHint;
    }

    public int hashCode() {
        return Objects.hash(this.mInitialSearchText, Boolean.valueOf(this.mIsLoading), this.mSearchHint, this.mItemList, Boolean.valueOf(this.mShowKeyboardByDefault), this.mHeaderAction, this.mActionStrip);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        return "SearchTemplate";
    }

    public SearchTemplate(AbstractC15991l abstractC15991l) {
        throw null;
    }
}
