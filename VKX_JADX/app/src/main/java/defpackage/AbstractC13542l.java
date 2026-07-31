package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lْٞؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13542l {
    public static final float crashlytics;
    public static final float loadAd;
    public static final boolean yandex;

    static {
        yandex = Build.VERSION.SDK_INT >= 31;
        loadAd = 12.0f;
        crashlytics = 10.0f;
    }

    public static /* synthetic */ Object amazon(Context context, String str, int i, int i2, boolean z, AbstractC5563l abstractC5563l, int i3) {
        if ((i3 & 4) != 0) {
            VKXApplication.Companion companion = VKXApplication.f36628l;
            i2 = VKXApplication.Companion.yandex(8.0f);
        }
        return crashlytics(context, str, i, i2, (i3 & 8) != 0 ? false : z, (i3 & 16) == 0, (i3 & 64) == 0, abstractC5563l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object crashlytics(Context context, String str, int i, int i2, boolean z, boolean z2, boolean z3, AbstractC0283l abstractC0283l) throws IOException {
        C0370l c0370l;
        Object num;
        if (abstractC0283l instanceof C0370l) {
            c0370l = (C0370l) abstractC0283l;
            int i3 = c0370l.f1445l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0370l.f1445l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0370l = new C0370l(abstractC0283l);
            }
        } else {
            c0370l = new C0370l(abstractC0283l);
        }
        Object objCrashlytics = c0370l.f1446l;
        int i4 = c0370l.f1445l;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            C9477l c9477l = new C9477l(context);
            if (str == null) {
                num = str;
                num = new Integer(R.drawable.generic_audio_nowplaying);
            }
            num = str;
            c9477l.crashlytics = num;
            c9477l.crashlytics(i);
            C10227l c10227lAdmob = AbstractC14055l.admob();
            if (z) {
                c10227lAdmob.add(new C5739l(C14473l.subs));
            }
            boolean z4 = yandex;
            if (z2 && (z3 || !z4)) {
                c10227lAdmob.add(new C1061l(i2));
            }
            AbstractC12872l.loadAd(c9477l, AbstractC14055l.purchase(c10227lAdmob));
            AbstractC10413l.yandex(c9477l, false);
            c9477l.loadAd().yandex(AbstractC10413l.mopub, Boolean.TRUE);
            C13177l c13177lYandex = AbstractC2952l.yandex(context);
            C7819l c7819lYandex = c9477l.yandex();
            c0370l.f1445l = 1;
            objCrashlytics = c13177lYandex.crashlytics(c7819lYandex, c0370l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objCrashlytics == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i4 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objCrashlytics);
        }
        InterfaceC11509l interfaceC11509l = (InterfaceC11509l) objCrashlytics;
        if (interfaceC11509l instanceof C6165l) {
            return ((C13028l) ((C6165l) interfaceC11509l).yandex).yandex;
        }
        if (interfaceC11509l instanceof C14542l) {
            return null;
        }
        C18725l.billing();
        return null;
    }

    public static final InterfaceC12001l loadAd(C6956l c6956l) {
        boolean z = yandex;
        C9885l c9885l = C9885l.yandex;
        if (!z) {
            c6956l.m2123default(1999952411);
            c6956l.startapp(false);
            return c9885l;
        }
        c6956l.m2123default(1999864154);
        InterfaceC12001l interfaceC12001lPurchase = purchase(c9885l, android.R.dimen.system_app_widget_inner_radius, c6956l);
        c6956l.startapp(false);
        return interfaceC12001lPurchase;
    }

    public static final InterfaceC12001l purchase(InterfaceC12001l interfaceC12001l, int i, C6956l c6956l) {
        Integer numValueOf = null;
        if (yandex) {
            c6956l.m2123default(268075764);
            numValueOf = ((Context) c6956l.isPro(AbstractC9404l.loadAd)).getResources().getResourceName(i) != null ? Integer.valueOf(i) : null;
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(268234174);
            c6956l.startapp(false);
        }
        return numValueOf != null ? interfaceC12001l.billing(new C14646l(new C3287l(numValueOf.intValue()))) : interfaceC12001l;
    }

    public static final InterfaceC12001l yandex(InterfaceC12001l interfaceC12001l, C6956l c6956l) {
        if (!yandex) {
            c6956l.m2123default(197413949);
            c6956l.startapp(false);
            return interfaceC12001l;
        }
        c6956l.m2123default(197320887);
        InterfaceC12001l interfaceC12001lPurchase = purchase(interfaceC12001l, android.R.dimen.system_app_widget_background_radius, c6956l);
        c6956l.startapp(false);
        return interfaceC12001lPurchase;
    }
}
