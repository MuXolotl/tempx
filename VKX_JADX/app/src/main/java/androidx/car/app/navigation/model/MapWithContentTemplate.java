package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import defpackage.AbstractC8494l;
import defpackage.C14111l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class MapWithContentTemplate implements InterfaceC11389l {
    private final ActionStrip mActionStrip;
    private final InterfaceC11389l mContentTemplate;
    private final MapController mMapController;

    private MapWithContentTemplate() {
        this.mMapController = null;
        this.mContentTemplate = new C14111l();
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapWithContentTemplate)) {
            return false;
        }
        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
        return Objects.equals(this.mContentTemplate, mapWithContentTemplate.mContentTemplate) && Objects.equals(this.mMapController, mapWithContentTemplate.mMapController) && Objects.equals(this.mActionStrip, mapWithContentTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public InterfaceC11389l getContentTemplate() {
        return this.mContentTemplate;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mContentTemplate, this.mActionStrip);
    }

    public MapWithContentTemplate(AbstractC8494l abstractC8494l) {
        throw null;
    }
}
