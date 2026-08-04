package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: renamed from: lؓۢٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2197l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f4846l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C9568l f4847l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C17385l f4848l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C11862l f4849l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C12507l f4850l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197l(C9568l c9568l, boolean z, C11862l c11862l, C17385l c17385l, C12507l c12507l) {
        super(10);
        this.f4847l = c9568l;
        this.f4846l = z;
        this.f4849l = c11862l;
        this.f4848l = c17385l;
        this.f4850l = c12507l;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؓۤٚ */
    public final InterfaceC9146l mo207l(int i, int i2, int i3, long j) {
        C11862l c11862l = this.f4849l;
        Object objLoadAd = c11862l.loadAd(i);
        Object objPurchase = c11862l.loadAd.purchase(i);
        List listM206l = m206l(this.f4848l, i, j);
        C9568l c9568l = this.f4847l;
        return new C15724l(i, objLoadAd, listM206l, c9568l.billing, c9568l.smaato, i2, i3, c9568l.isPro, c9568l.firebase, objPurchase, c9568l.yandex.tapsense, j);
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final C15724l m1117l(int i, long j) {
        int i2;
        long jAdmob;
        C11862l c11862l = this.f4849l;
        Object objLoadAd = c11862l.loadAd(i);
        Object objPurchase = c11862l.loadAd.purchase(i);
        C12507l c12507l = this.f4850l;
        int[] iArr = c12507l.f24646l;
        int length = iArr.length;
        int i3 = (int) (j >> 32);
        int i4 = length - 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        int i5 = ((int) (j & 4294967295L)) - i3;
        int i6 = length - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = c12507l.f24647l;
            int i7 = (i4 + i5) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i4];
        }
        if (this.f4846l) {
            if (i2 < 0) {
                AbstractC10280l.yandex("width must be >= 0");
            }
            jAdmob = AbstractC7563l.admob(i2, i2, 0, Alert.DURATION_SHOW_INDEFINITELY);
        } else {
            if (i2 < 0) {
                AbstractC10280l.yandex("height must be >= 0");
            }
            jAdmob = AbstractC7563l.admob(0, Alert.DURATION_SHOW_INDEFINITELY, i2, i2);
        }
        long j2 = jAdmob;
        List listM206l = m206l(this.f4848l, i, j2);
        C9568l c9568l = this.f4847l;
        return new C15724l(i, objLoadAd, listM206l, c9568l.billing, c9568l.smaato, i4, i5, c9568l.isPro, c9568l.firebase, objPurchase, c9568l.yandex.tapsense, j2);
    }
}
