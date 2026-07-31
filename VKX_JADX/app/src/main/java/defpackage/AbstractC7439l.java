package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚۖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7439l {
    public static final C7136l[] yandex = new C7136l[0];

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object amazon(InterfaceC2957l interfaceC2957l, Member member) throws C10756l {
        try {
            AbstractC2711l.f5864l.getClass();
            Object obj = AbstractC2711l.f5865l;
            if (obj == null || obj == null) {
                List parameters = interfaceC2957l.getParameters();
                if (!(parameters != null) || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (((AbstractC9707l) it.next()).premium() != 3);
                }
                throw new RuntimeException('\'' + interfaceC2957l + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objPurchase = AbstractC7572l.admob(interfaceC2957l) ? AbstractC7572l.purchase(interfaceC2957l) : null;
            AbstractC2711l.f5864l.getClass();
            if (objPurchase == AbstractC2711l.f5865l) {
                objPurchase = null;
            }
            AbstractC7572l.admob(interfaceC2957l);
            AccessibleObject accessibleObject = AbstractC2812l.advert(member) ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(AbstractC5309l.billing(interfaceC2957l));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objPurchase);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objPurchase == null) {
                    objPurchase = AbstractC5592l.amazon(((Method) member).getParameterTypes()[0]);
                }
                return method.invoke(null, objPurchase);
            }
            if (length == 2) {
                return ((Method) member).invoke(null, objPurchase, AbstractC5592l.amazon(((Method) member).getParameterTypes()[1]));
            }
            throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
        } catch (IllegalAccessException e) {
            throw new C10756l(8, "Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
        }
    }

    public static C7568l crashlytics(long j, long j2, C6956l c6956l, int i, int i2) {
        long jSubs = (i2 & 1) != 0 ? ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).subs() : j;
        long jYandex = AbstractC10689l.yandex(jSubs, c6956l);
        long jAmazon = (i2 & 4) != 0 ? ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).amazon() : j2;
        long jYandex2 = AbstractC10689l.yandex(jAmazon, c6956l);
        long jYandex3 = AbstractC10689l.yandex(jAmazon, c6956l);
        C10707l c10707l = AbstractC10689l.yandex;
        return new C7568l(jSubs, jYandex, jAmazon, jYandex2, jAmazon, jYandex3, C9735l.loadAd(0.4f, ((C10936l) c6956l.isPro(c10707l)).isPro()), ((C10936l) c6956l.isPro(c10707l)).purchase());
    }

    public static final void yandex(AudioTrack audioTrack, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        Integer num;
        C16395l c16395l;
        boolean z;
        Integer num2;
        audioTrack = audioTrack;
        C6956l c6956l2 = c6956l;
        int i2 = audioTrack.purchase;
        long j = audioTrack.firebase;
        PodcastInfo podcastInfo = audioTrack.advert;
        c6956l2.m2133new(-1644179983);
        int i3 = i | (c6956l2.billing(audioTrack) ? 4 : 2) | (c6956l2.billing(interfaceC17242l) ? 32 : 16);
        if (c6956l2.m2127for(i3 & 1, (i3 & 19) != 18)) {
            C10707l c10707l = AbstractC1242l.loadAd;
            Context context = (Context) c6956l2.isPro(c10707l);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC13273l.loadAd(context, R.drawable.placeholder_audio);
                c6956l2.m2147try(objM2132native);
            }
            AbstractC14165l abstractC14165lYandex = AbstractC7041l.yandex((Drawable) objM2132native, c6956l2);
            boolean zPurchase = c6956l2.purchase(j);
            Object objM2132native2 = c6956l2.m2132native();
            if (zPurchase || objM2132native2 == c13863l) {
                objM2132native2 = AbstractC7076l.amazon(context, j);
                c6956l2.m2147try(objM2132native2);
            }
            String str = (String) objM2132native2;
            boolean zAmazon = c6956l2.amazon(i2) | c6956l2.billing(podcastInfo);
            Object objM2132native3 = c6956l2.m2132native();
            if (zAmazon || objM2132native3 == c13863l) {
                objM2132native3 = Integer.valueOf(i2 - ((podcastInfo == null || (num = podcastInfo.purchase) == null) ? 0 : num.intValue()));
                c6956l2.m2147try(objM2132native3);
            }
            int iIntValue = ((Number) objM2132native3).intValue();
            boolean zAmazon2 = c6956l2.amazon(iIntValue);
            Object objM2132native4 = c6956l2.m2132native();
            if (zAmazon2 || objM2132native4 == c13863l) {
                DecimalFormat decimalFormat = C15638l.yandex;
                objM2132native4 = AbstractC14205l.amazon(iIntValue, false);
                c6956l2.m2147try(objM2132native4);
            }
            String str2 = (String) objM2132native4;
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l2 = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l2);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C0086l c0086l = C18450l.f36040l;
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c0086l, c6956l2, 54);
            long j3 = c6956l2.f14595continue;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l2);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            C9477l c9477l = new C9477l((Context) c6956l2.isPro(c10707l));
            c9477l.crashlytics = audioTrack;
            c9477l.crashlytics(300);
            AbstractC7741l.purchase(c9477l.yandex(), null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 48.0f), AbstractC7497l.yandex(8.0f)), abstractC14165lYandex, abstractC14165lYandex, null, c6956l, 36912, 0, 32736);
            AbstractC13010l.loadAd(audioTrack.amazon, null, AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, 0, 24960, 241658);
            c6956l.startapp(true);
            String str3 = podcastInfo != null ? podcastInfo.amazon : null;
            if (str3 == null) {
                str3 = "";
            }
            AbstractC13010l.loadAd(str3, AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, AbstractC13106l.admob(c6956l).vip, c6956l, 48, 24960, 110584);
            C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(2.0f, true, new C8339l(12)), c0086l, c6956l, 54);
            long j4 = c6956l.f14595continue;
            int i6 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c16395l = c16395l2;
                c6956l.firebase(c16395l);
            } else {
                c16395l = c16395l2;
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            C16395l c16395l3 = c16395l;
            AbstractC13010l.loadAd(str, null, AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).vip, c6956l, 0, 0, 131066);
            AbstractC13010l.loadAd(" • ", null, AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).vip, c6956l, 6, 0, 131066);
            c6956l2 = c6956l;
            if (iIntValue <= 0) {
                c6956l2.m2123default(-1638372048);
                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, 0, c6956l2), null, AbstractC0080l.isPro(c4346l, 16.0f), AbstractC13106l.purchase(c6956l2).yandex, c6956l2, 440, 0);
                c6956l2.startapp(false);
                z = true;
                audioTrack = audioTrack;
            } else {
                int i7 = 0;
                if (((podcastInfo == null || (num2 = podcastInfo.purchase) == null) ? 0 : num2.intValue()) > 0) {
                    c6956l2.m2123default(-1638018679);
                    C5062l c5062lYandex3 = AbstractC7001l.yandex(new C7537l(6.0f, true, new C8339l(12)), c0086l, c6956l2, 54);
                    long j5 = c6956l2.f14595continue;
                    int i8 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, c4346l);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l3);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex3, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l2);
                    AbstractC11043l.isPro(i8, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l4);
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(AbstractC0080l.purchase(AbstractC0080l.vip(c4346l, 72.0f), 2.0f), AbstractC7497l.yandex);
                    long j6 = AbstractC13106l.purchase(c6956l2).yandex;
                    long j7 = AbstractC13106l.purchase(c6956l2).subscription;
                    boolean z2 = (i3 & 14) == 4;
                    Object objM2132native5 = c6956l2.m2132native();
                    if (z2 || objM2132native5 == c13863l) {
                        objM2132native5 = new C11704l(audioTrack, 5);
                        c6956l2.m2147try(objM2132native5);
                    }
                    Function0 function0 = (Function0) objM2132native5;
                    Object objM2132native6 = c6956l2.m2132native();
                    if (objM2132native6 == c13863l) {
                        objM2132native6 = new C8578l(i7);
                        c6956l2.m2147try(objM2132native6);
                    }
                    AbstractC4332l.loadAd(function0, interfaceC17242lCrashlytics, j6, j7, 2, 0.0f, (Function1) objM2132native6, c6956l, 1769472, 0);
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_left, new Object[]{str2}, c6956l), AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC13106l.admob(c6956l).vip, c6956l, 48, 24960, 110584);
                    c6956l2 = c6956l;
                    c6956l2.startapp(true);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2123default(-1636782182);
                    AbstractC13010l.loadAd(str2, null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).vip, c6956l, 0, 0, 131066);
                    c6956l2 = c6956l;
                    c6956l2.startapp(false);
                }
                z = true;
            }
            c6956l2.startapp(z);
            c6956l2.startapp(z);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3666l(audioTrack, interfaceC17242l, i, 16);
        }
    }

    public abstract String loadAd();
}
