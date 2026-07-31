package androidx.car.app.model;

import defpackage.C4514l;
import defpackage.C5233l;
import defpackage.C8081l;
import defpackage.InterfaceC11389l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class PaneTemplate implements InterfaceC11389l {

    @Deprecated
    private final ActionStrip mActionStrip;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final Pane mPane;

    @Deprecated
    private final CarText mTitle;

    public PaneTemplate(C4514l c4514l) {
        c4514l.getClass();
        this.mTitle = null;
        this.mPane = c4514l.yandex;
        this.mHeaderAction = c4514l.loadAd;
        this.mActionStrip = null;
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return Objects.equals(this.mTitle, paneTemplate.mTitle) && Objects.equals(this.mPane, paneTemplate.mPane) && Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, paneTemplate.mActionStrip) && Objects.equals(this.mHeader, paneTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
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

    public Pane getPane() {
        Pane pane = this.mPane;
        Objects.requireNonNull(pane);
        return pane;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mPane, this.mHeaderAction, this.mActionStrip, this.mHeader);
    }

    public String toString() {
        return "PaneTemplate";
    }

    private PaneTemplate() {
        this.mTitle = null;
        this.mPane = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mHeader = null;
    }
}
