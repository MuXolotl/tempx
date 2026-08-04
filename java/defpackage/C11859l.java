package defpackage;

import androidx.car.app.model.Alert;
import java.io.Serializable;

/* JADX INFO: renamed from: lِٕٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11859l implements Serializable, Cloneable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f23681l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f23682l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C12007l f23683l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f23685l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f23684l = false;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f23686l = false;

    public C11859l(int i) {
        this.f23682l = i;
    }

    public final int loadAd() {
        return (!this.f23684l || this.f23686l) ? Alert.DURATION_SHOW_INDEFINITELY : this.f23681l;
    }

    /* JADX INFO: renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public final C11859l clone() {
        C11859l c11859l = new C11859l(this.f23682l);
        c11859l.f23683l = this.f23683l;
        c11859l.f23681l = this.f23681l;
        c11859l.f23685l = this.f23685l;
        c11859l.f23684l = this.f23684l;
        c11859l.f23686l = this.f23686l;
        return c11859l;
    }
}
