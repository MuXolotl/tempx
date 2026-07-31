package defpackage;

import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘؒؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5374l {
    public static final C11911l firebase;
    public final C14169l billing;
    public final C3557l isPro;
    public final C16543l mopub;
    public final C7026l purchase;
    public final C16864l subs;
    public final C7026l yandex;
    public final C3316l loadAd = new C3316l(22);
    public final C5374l crashlytics = this;
    public final C5374l amazon = this;
    public final String admob = AbstractC16648l.ads(new byte[]{97, 112, 105, 46, 118, 107, 120, 46, 97, 112, 112});

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(Unit.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(Unit.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        firebase = new C11911l("spark-bypass-auth-await", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }

    public C5374l(C7026l c7026l, VKXApplication vKXApplication, C7026l c7026l2, C16864l c16864l) {
        this.yandex = c7026l;
        this.purchase = c7026l2;
        this.billing = new C14169l(vKXApplication);
        int i = 26;
        this.mopub = new C16543l(i, c7026l2);
        C2885l c2885l = c16864l.f32916l;
        C16990l c16990l = new C16990l();
        c16990l.purchase(c16864l.f32915l);
        c16990l.yandex(AbstractC18358l.amazon, new C1698l(16));
        c16990l.yandex(AbstractC4689l.loadAd, new C1698l(17));
        c16990l.yandex(AbstractC11201l.loadAd, new C1698l(18));
        c16990l.yandex(AbstractC3180l.crashlytics, new C15759l(this, 0));
        C15759l c15759l = new C15759l(this, 1);
        InterfaceC6272l interfaceC6272l = AbstractC3552l.yandex;
        c16990l.yandex(C10541l.loadAd, new C0786l(2, c15759l));
        Unit unit = Unit.INSTANCE;
        C16864l c16864l2 = new C16864l(c2885l, c16990l, c16864l.f32912l);
        this.subs = c16864l2;
        C5501l c5501l = new C5501l(i, c16864l2);
        C3557l c3557l = new C3557l();
        int i2 = 15;
        c3557l.f7480l = new C5138l(i2, c5501l);
        int i3 = 13;
        c3557l.f7479l = new C7972l(i3, c5501l);
        c3557l.f7478l = new C10975l(i3, c5501l);
        c3557l.f7482l = new C1770l(i2, c5501l);
        c3557l.f7481l = new C3585l(i2, c5501l);
        this.isPro = c3557l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(AbstractC0283l abstractC0283l) throws Throwable {
        C18653l c18653l;
        if (abstractC0283l instanceof C18653l) {
            c18653l = (C18653l) abstractC0283l;
            int i = c18653l.f36434l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18653l.f36434l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18653l = new C18653l(this, abstractC0283l);
            }
        } else {
            c18653l = new C18653l(this, abstractC0283l);
        }
        Object objAmazon = c18653l.f36433l;
        int i2 = c18653l.f36434l;
        C14169l c14169l = this.billing;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAmazon);
            c14169l.loadAd(C1946l.yandex);
            c18653l.f36434l = 1;
            objAmazon = AbstractC12754l.amazon(this.amazon, c18653l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAmazon);
        }
        C5492l c5492l = (C5492l) objAmazon;
        C2675l c2675l = C2675l.yandex;
        if (c5492l != null) {
            C1008l c1008l = (C1008l) c14169l.loadAd;
            c1008l.smaato(c5492l);
            if (c1008l.getValue() != null) {
                c14169l.loadAd(c2675l);
            }
            return objAmazon;
        }
        C1008l c1008l2 = (C1008l) c14169l.loadAd;
        c1008l2.smaato(null);
        if (c1008l2.getValue() != null) {
            c14169l.loadAd(c2675l);
        }
        ((C1008l) c14169l.crashlytics).smaato(null);
        if (((C1008l) c14169l.loadAd).getValue() != null) {
            c14169l.loadAd(c2675l);
        }
        c14169l.loadAd(new C5549l(1));
        return objAmazon;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0114, code lost:
    
        if (crashlytics(r0) == r5) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object crashlytics(defpackage.AbstractC0283l r13) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5374l.crashlytics(lّؑۧ):java.lang.Object");
    }

    public final Object loadAd(AbstractC0283l abstractC0283l) {
        Object objAdmob = AbstractC11990l.admob(new C2545l(this, null, 1), abstractC0283l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object purchase(AbstractC0283l abstractC0283l) throws Throwable {
        C10720l c10720l;
        C14169l c14169l;
        if (abstractC0283l instanceof C10720l) {
            c10720l = (C10720l) abstractC0283l;
            int i = c10720l.f21727l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10720l.f21727l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10720l = new C10720l(this, abstractC0283l);
            }
        } else {
            c10720l = new C10720l(this, abstractC0283l);
        }
        Object objSmaato = c10720l.f21728l;
        int i2 = c10720l.f21727l;
        C14169l c14169l2 = this.billing;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objSmaato);
                C13568l c13568lM1817l = ((C5501l) ((C10975l) this.isPro.f7478l).f22121l).m1817l(new C10111l("/InboxService/GetIsRead", C15242l.f29837l, C15309l.f29917l, 19));
                C15242l c15242l = new C15242l();
                c10720l.f21729l = c14169l2;
                c10720l.f21727l = 1;
                objSmaato = c13568lM1817l.smaato(c15242l, c10720l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objSmaato == enumC9342l) {
                    return enumC9342l;
                }
                c14169l = c14169l2;
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c14169l = c10720l.f21729l;
                AbstractC2829l.crashlytics(objSmaato);
            }
            ((C1008l) c14169l.amazon).smaato((C15309l) objSmaato);
        } catch (Exception unused) {
            ((C1008l) c14169l2.amazon).smaato(null);
        }
        return Unit.INSTANCE;
    }

    public final void yandex() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.purchase.f14720l;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
        C14169l c14169l = this.billing;
        C1008l c1008l = (C1008l) c14169l.loadAd;
        c1008l.smaato(null);
        if (c1008l.getValue() != null) {
            c14169l.loadAd(C2675l.yandex);
        }
        ((C1008l) c14169l.amazon).smaato(null);
        c14169l.loadAd(C1946l.yandex);
        Iterable iterable = (List) this.subs.f32917l.billing(AbstractC3180l.amazon);
        if (iterable == null) {
            iterable = C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof C5808l) {
                arrayList.add(obj);
            }
        }
        C5808l c5808l = (C5808l) AbstractC16901l.m4236public(arrayList);
        if (c5808l != null) {
            C0746l.crashlytics(c5808l.crashlytics);
        }
    }
}
