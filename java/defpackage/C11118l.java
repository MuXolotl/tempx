package defpackage;

import android.view.Surface;
import java.util.List;

/* JADX INFO: renamed from: lُٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11118l implements InterfaceC11724l, InterfaceC18679l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f22325l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22326l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22327l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f22328l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f22329l;

    public /* synthetic */ C11118l(Object obj, Object obj2, int i, int i2, int i3) {
        this.f22327l = i3;
        this.f22326l = obj;
        this.f22328l = obj2;
        this.f22325l = i;
        this.f22329l = i2;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        BinderC4841l binderC4841l = (BinderC4841l) this.f22326l;
        Surface surface = (Surface) this.f22328l;
        C18602l c18602l = (C18602l) obj;
        ((C3726l) binderC4841l.purchase.get()).getClass();
        if (surface == null) {
            c18602l.mo2750catch(null);
            binderC4841l.firebase = null;
        } else {
            SurfaceHolderC12693l surfaceHolderC12693l = new SurfaceHolderC12693l(surface, this.f22325l, this.f22329l);
            binderC4841l.firebase = surfaceHolderC12693l;
            c18602l.mo2750catch(surfaceHolderC12693l);
        }
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        int i2 = this.f22327l;
        Object obj = this.f22328l;
        Object obj2 = this.f22326l;
        switch (i2) {
            case 0:
                C13208l c13208l = (C13208l) obj2;
                List list = (List) obj;
                C16971l c16971lMetrica = AbstractC1186l.metrica();
                for (int i3 = 0; i3 < list.size(); i3++) {
                    c16971lMetrica.crashlytics(((C2427l) list.get(i3)).crashlytics(c13208l.m3611l(), true));
                }
                BinderC11373l binderC11373l = new BinderC11373l(c16971lMetrica.mopub());
                int iM3611l = c13208l.m3611l();
                BinderC11857l binderC11857l = c13208l.crashlytics;
                int i4 = this.f22325l;
                int i5 = this.f22329l;
                if (iM3611l >= 2) {
                    interfaceC4725l.mo471try(binderC11857l, i, i4, i5, binderC11373l);
                } else {
                    interfaceC4725l.mo458l(binderC11857l, i, i5, binderC11373l);
                    interfaceC4725l.mo424abstract(c13208l.crashlytics, i, i4, i5);
                }
                break;
            default:
                int i6 = this.f22329l;
                interfaceC4725l.mo457l(((C13208l) obj2).crashlytics, i, (Surface) obj, this.f22325l, i6);
                break;
        }
    }
}
