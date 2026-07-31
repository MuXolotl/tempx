package androidx.car.app.navigation.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import defpackage.AbstractC14973l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC4441l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
@Deprecated
public final class RoutePreviewNavigationTemplate implements InterfaceC11389l {
    private final ActionStrip mActionStrip;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final ActionStrip mMapActionStrip;
    private final Action mNavigateAction;
    private final InterfaceC4441l mPanModeDelegate;

    @Deprecated
    private final CarText mTitle;

    private RoutePreviewNavigationTemplate() {
        this.mTitle = null;
        this.mIsLoading = false;
        this.mNavigateAction = null;
        this.mItemList = null;
        this.mHeader = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutePreviewNavigationTemplate)) {
            return false;
        }
        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
        if (this.mIsLoading == routePreviewNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, routePreviewNavigationTemplate.mTitle) && Objects.equals(this.mNavigateAction, routePreviewNavigationTemplate.mNavigateAction) && Objects.equals(this.mItemList, routePreviewNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, routePreviewNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, routePreviewNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, routePreviewNavigationTemplate.mMapActionStrip)) {
            if (Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(routePreviewNavigationTemplate.mPanModeDelegate == null)) && Objects.equals(this.mHeader, routePreviewNavigationTemplate.mHeader)) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public Action getNavigateAction() {
        return this.mNavigateAction;
    }

    public InterfaceC4441l getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Boolean.valueOf(this.mIsLoading), this.mNavigateAction, this.mItemList, this.mHeaderAction, this.mActionStrip, this.mMapActionStrip, Boolean.valueOf(this.mPanModeDelegate == null), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "RoutePreviewNavigationTemplate";
    }

    public RoutePreviewNavigationTemplate(AbstractC14973l abstractC14973l) {
        throw null;
    }
}
