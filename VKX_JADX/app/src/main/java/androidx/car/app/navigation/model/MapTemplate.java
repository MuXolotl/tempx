package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import defpackage.AbstractC11986l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
@Deprecated
public final class MapTemplate implements InterfaceC11389l {
    private final ActionStrip mActionStrip;
    private final Header mHeader;
    private final ItemList mItemList;
    private final MapController mMapController;
    private final Pane mPane;

    private MapTemplate() {
        this.mMapController = null;
        this.mPane = null;
        this.mItemList = null;
        this.mHeader = null;
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapTemplate)) {
            return false;
        }
        MapTemplate mapTemplate = (MapTemplate) obj;
        return Objects.equals(this.mPane, mapTemplate.mPane) && Objects.equals(this.mItemList, mapTemplate.mItemList) && Objects.equals(this.mHeader, mapTemplate.mHeader) && Objects.equals(this.mMapController, mapTemplate.mMapController) && Objects.equals(this.mActionStrip, mapTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public Pane getPane() {
        return this.mPane;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mPane, this.mItemList, this.mHeader, this.mActionStrip);
    }

    public MapTemplate(AbstractC11986l abstractC11986l) {
        throw null;
    }
}
