package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8763l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Bitmap f18040l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3312l f18041l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18042l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C3259l f18043l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f18044l;

    public /* synthetic */ C8763l(C3312l c3312l, Bitmap bitmap, long j, C3259l c3259l, int i, int i2) {
        this.f18042l = i2;
        this.f18041l = c3312l;
        this.f18040l = bitmap;
        this.f18044l = j;
        this.f18043l = c3259l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18042l) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(4097);
                this.f18041l.smaato(this.f18040l, this.f18044l, this.f18043l, (C6956l) obj, iPurchase);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(4097);
                this.f18041l.firebase(this.f18040l, this.f18044l, this.f18043l, (C6956l) obj, iPurchase2);
                break;
        }
        return Unit.INSTANCE;
    }
}
