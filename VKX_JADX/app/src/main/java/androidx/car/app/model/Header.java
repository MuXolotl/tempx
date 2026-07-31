package androidx.car.app.model;

import defpackage.AbstractC6427l;
import defpackage.C5233l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class Header {
    private final List<Action> mEndHeaderActions;
    private final Action mStartHeaderAction;
    private final CarText mTitle;

    public Header(C5233l c5233l) {
        this.mTitle = c5233l.crashlytics;
        this.mStartHeaderAction = c5233l.loadAd;
        this.mEndHeaderActions = AbstractC6427l.remoteconfig(c5233l.yandex);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Objects.equals(this.mTitle, header.mTitle) && Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction);
    }

    public List<Action> getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mEndHeaderActions, this.mStartHeaderAction);
    }

    public String toString() {
        return "Header: " + this.mTitle;
    }

    private Header() {
        this.mTitle = null;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = new ArrayList();
    }
}
