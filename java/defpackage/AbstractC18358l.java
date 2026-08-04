package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l٘ۧؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18358l {
    public static final C18449l amazon;
    public static final C11911l crashlytics;
    public static final Set loadAd;
    public static final InterfaceC6272l yandex = AbstractC1937l.loadAd("io.ktor.client.plugins.contentnegotiation.ContentNegotiation");

    static {
        InterfaceC13012l interfaceC13012lLoadAd;
        C2336l c2336l = AbstractC18202l.yandex;
        loadAd = AbstractC8669l.m2407import(new InterfaceC1388l[]{c2336l.loadAd(byte[].class), c2336l.loadAd(String.class), c2336l.loadAd(C2759l.class), c2336l.loadAd(InterfaceC9354l.class), c2336l.loadAd(AbstractC8870l.class), c2336l.loadAd(AbstractC2914l.class), c2336l.loadAd(AbstractC12838l.class)});
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(List.class);
        try {
            C0861l c0861l = C0861l.crashlytics;
            interfaceC13012lLoadAd = AbstractC18202l.loadAd(List.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C5254l.class)));
        } catch (Throwable unused) {
            interfaceC13012lLoadAd = null;
        }
        crashlytics = new C11911l("ExcludedContentTypesAttr", new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd));
        amazon = new C18449l("ContentNegotiation", C14921l.f29373l, new C4100l(24));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(Set set, List list, C2540l c2540l, C11310l c11310l, InterfaceC9354l interfaceC9354l, C5254l c5254l, Charset charset, AbstractC0283l abstractC0283l) throws C10756l {
        C13018l c13018l;
        if (abstractC0283l instanceof C13018l) {
            c13018l = (C13018l) abstractC0283l;
            int i = c13018l.f25496l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13018l.f25496l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13018l = new C13018l(abstractC0283l);
            }
        } else {
            c13018l = new C13018l(abstractC0283l);
        }
        Object objLoadAd = c13018l.f25494l;
        int i2 = c13018l.f25496l;
        InterfaceC6272l interfaceC6272l = yandex;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            if (!AbstractC2812l.advert(interfaceC9354l)) {
                interfaceC6272l.vip("Response body is already transformed. Skipping ContentNegotiation for " + c2540l + '.');
                return null;
            }
            if (set.contains(c11310l.yandex)) {
                interfaceC6272l.vip("Response body type " + c11310l.yandex + " is in ignored types. Skipping ContentNegotiation for " + c2540l + '.');
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C3531l) obj).crashlytics.admob(c5254l)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C3531l) it.next()).yandex);
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                interfaceC6272l.vip("None of the registered converters match response with Content-Type=" + c5254l + ". Skipping ContentNegotiation for " + c2540l + '.');
                return null;
            }
            c13018l.f25495l = c2540l;
            c13018l.f25496l = 1;
            objLoadAd = AbstractC16837l.loadAd(arrayList2, interfaceC9354l, c11310l, charset, c13018l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2540l = c13018l.f25495l;
            AbstractC2829l.crashlytics(objLoadAd);
        }
        if (!(objLoadAd instanceof InterfaceC9354l)) {
            interfaceC6272l.vip("Response body was converted to " + AbstractC18202l.yandex.loadAd(objLoadAd.getClass()) + " for " + c2540l + '.');
        }
        return objLoadAd;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x023d  */
    /* JADX WARN: Code duplicated, block: B:104:0x025c  */
    /* JADX WARN: Code duplicated, block: B:105:0x025f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x0205  */
    /* JADX WARN: Code duplicated, block: B:94:0x0219  */
    /* JADX WARN: Code duplicated, block: B:95:0x021b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0233 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0234 -> B:100:0x0239). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object yandex(java.util.List r16, java.util.Set r17, defpackage.C12825l r18, defpackage.C6806l r19, java.lang.Object r20, defpackage.AbstractC0283l r21) throws defpackage.C10756l, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18358l.yandex(java.util.List, java.util.Set, lّۙۚ, lؙ۠ۗ, java.lang.Object, lّؑۧ):java.lang.Object");
    }
}
