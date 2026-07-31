package androidx.car.app.model;

import defpackage.AbstractC3867l;
import defpackage.C5233l;
import defpackage.C8081l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class GridTemplate implements InterfaceC11389l {
    public static final int ITEM_IMAGE_SHAPE_CIRCLE = 2;
    public static final int ITEM_IMAGE_SHAPE_UNSET = 1;
    public static final int ITEM_SIZE_LARGE = 4;
    public static final int ITEM_SIZE_MEDIUM = 2;
    public static final int ITEM_SIZE_SMALL = 1;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final int mItemImageShape;
    private final int mItemSize;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    private GridTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        this.mActionStrip = null;
        this.mActions = Collections.EMPTY_LIST;
        this.mItemSize = 1;
        this.mItemImageShape = 1;
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridTemplate)) {
            return false;
        }
        GridTemplate gridTemplate = (GridTemplate) obj;
        return this.mIsLoading == gridTemplate.mIsLoading && Objects.equals(this.mTitle, gridTemplate.mTitle) && Objects.equals(this.mHeaderAction, gridTemplate.mHeaderAction) && Objects.equals(this.mSingleList, gridTemplate.mSingleList) && Objects.equals(this.mActionStrip, gridTemplate.mActionStrip) && Objects.equals(this.mActions, gridTemplate.mActions) && this.mItemSize == gridTemplate.mItemSize && this.mItemImageShape == gridTemplate.mItemImageShape && Objects.equals(this.mHeader, gridTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        C5233l c5233l = new C5233l();
        CarText carText = this.mTitle;
        if (carText != null) {
            c5233l.crashlytics = carText;
            C8081l.purchase.loadAd(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            c5233l.loadAd(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            for (Action action2 : actionStrip.getActions()) {
                Objects.requireNonNull(action2);
                c5233l.yandex.add(action2);
            }
        }
        return c5233l.yandex();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public int getItemImageShape() {
        return this.mItemImageShape;
    }

    public int getItemSize() {
        return this.mItemSize;
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mActionStrip, Integer.valueOf(this.mItemSize), Integer.valueOf(this.mItemImageShape), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "GridTemplate";
    }

    public GridTemplate(AbstractC3867l abstractC3867l) {
        throw null;
    }
}
