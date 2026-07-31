package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗؑؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4580l extends AbstractC9487l implements InterfaceC18421l, InterfaceC8504l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l f9289l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AutofillId f9290l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C4622l f9291l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18483l f9292l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6079l f9293l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f9294l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C0151l f9295l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f9296l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Rect f9297l = new Rect();

    public C4580l(C6079l c6079l, C18483l c18483l, ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, C0151l c0151l, String str) {
        this.f9293l = c6079l;
        this.f9292l = c18483l;
        this.f9289l = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.f9295l = c0151l;
        this.f9294l = str;
        viewTreeObserverOnGlobalLayoutListenerC13840l.setImportantForAutofill(1);
        C3865l c3865lAmazon = AbstractC17082l.amazon(viewTreeObserverOnGlobalLayoutListenerC13840l);
        AutofillId autofillId = c3865lAmazon != null ? (AutofillId) c3865lAmazon.yandex : null;
        if (autofillId == null) {
            throw AbstractC5020l.metrica("Required value was null.");
        }
        this.f9290l = autofillId;
        this.f9291l = new C4622l();
    }

    public final void loadAd(SparseArray sparseArray) {
        C6264l c6264lAdvert;
        Function1 function1;
        Function1 function2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueMopub = C14377l.mopub(sparseArray.get(iKeyAt));
            C3654l c3654l = (C3654l) this.f9292l.crashlytics.loadAd(iKeyAt);
            if (c3654l != null && (c6264lAdvert = c3654l.advert()) != null) {
                C13660l c13660l = c6264lAdvert.f13225l;
                Object objMopub = c13660l.mopub(AbstractC16601l.mopub);
                if (objMopub == null) {
                    objMopub = null;
                }
                C7629l c7629l = (C7629l) objMopub;
                if (c7629l != null && (function2 = (Function1) c7629l.loadAd) != null) {
                }
                Object objMopub2 = c13660l.mopub(AbstractC16601l.admob);
                C7629l c7629l2 = (C7629l) (objMopub2 != null ? objMopub2 : null);
                if (c7629l2 != null && (function1 = (Function1) c7629l2.loadAd) != null) {
                }
            }
        }
    }

    @Override // defpackage.InterfaceC8504l
    public final void yandex(C6543l c6543l, C6543l c6543l2) {
        C3654l c3654lMetrica;
        C6264l c6264lAdvert;
        C3654l c3654lMetrica2;
        C6264l c6264lAdvert2;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f9289l;
        C6079l c6079l = this.f9293l;
        if (c6543l != null && (c3654lMetrica2 = AbstractC5573l.metrica(c6543l)) != null && (c6264lAdvert2 = c3654lMetrica2.advert()) != null && AbstractC18719l.yandex(c6264lAdvert2)) {
            c6079l.purchase(viewTreeObserverOnGlobalLayoutListenerC13840l, c3654lMetrica2.f7685l);
        }
        if (c6543l2 == null || (c3654lMetrica = AbstractC5573l.metrica(c6543l2)) == null || (c6264lAdvert = c3654lMetrica.advert()) == null || !AbstractC18719l.yandex(c6264lAdvert)) {
            return;
        }
        int i = c3654lMetrica.f7685l;
        C0151l c0151l = this.f9295l;
        C3654l c3654l = (C3654l) c0151l.yandex.loadAd(i);
        if (c3654l == null || c3654l.f7674l == -4) {
            return;
        }
        C13698l c13698l = c0151l.crashlytics;
        int iPurchase = c0151l.purchase(c3654l);
        long[] jArr = (long[]) c13698l.f26743l;
        long j = jArr[iPurchase];
        long j2 = jArr[iPurchase + 1];
        c6079l.amazon(viewTreeObserverOnGlobalLayoutListenerC13840l, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
