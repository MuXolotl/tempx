package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lَِٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15617l implements InterfaceC5152l, InterfaceC3990l, InterfaceC17806l, InterfaceC15446l, InterfaceC18565l, InterfaceC0993l, InterfaceC13540l, InterfaceC15378l, InterfaceC8982l, InterfaceC17325l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final C15617l f30488l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C15617l f30490l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C15617l f30492l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C15617l f30493l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C15617l f30494l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C15617l f30495l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C15617l f30496l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C15617l f30497l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C15617l f30498l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C15617l f30499l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C15617l f30500l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public static final C15617l f30501l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C15617l f30502l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C15617l f30503l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C15617l f30504l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C15617l f30505l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C15617l f30506l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final C15617l f30507l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C15617l f30508l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C15617l f30509l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C15617l f30510l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C15617l f30511l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C15617l f30512l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C15617l f30513l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C15617l f30514l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30515l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C12222l f30491l = new C12222l("AfterRender");

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C5102l f30489l = new C5102l();

    static {
        byte b = 0;
        f30498l = new C15617l(b, 1);
        f30506l = new C15617l(b, 2);
        f30505l = new C15617l(b, 4);
        f30510l = new C15617l(b, 5);
        f30492l = new C15617l(b, 7);
        int i = 8;
        f30495l = new C15617l(b, i);
        f30509l = new C15617l(b, i);
        f30503l = new C15617l(b, i);
        f30511l = new C15617l(b, i);
        f30508l = new C15617l(b, i);
        f30490l = new C15617l(b, i);
        f30512l = new C15617l(b, 9);
        f30504l = new C15617l(b, 10);
        f30496l = new C15617l(b, 11);
        f30500l = new C15617l(b, 12);
        f30513l = new C15617l(b, 13);
        f30499l = new C15617l(b, 14);
        f30494l = new C15617l(b, 15);
        f30493l = new C15617l(b, 16);
        f30514l = new C15617l(b, 18);
        f30497l = new C15617l(b, 19);
        f30502l = new C15617l(b, 20);
        f30507l = new C15617l(b, 21);
        f30488l = new C15617l(b, 22);
        f30501l = new C15617l(b, 23);
    }

    public C15617l(int i) {
        int i2;
        this.f30515l = 25;
        HashMap map = new HashMap();
        int i3 = i - 2;
        int iMopub = AbstractC14289l.mopub(i3);
        int iIsPro = AbstractC6974l.isPro(-i);
        for (int i4 = 1; i4 < iMopub; i4++) {
            int i5 = 1 << (i4 - 1);
            if (i5 >= 64 && !map.containsKey(Integer.valueOf(i5))) {
                map.put(Integer.valueOf(i5), Integer.valueOf(smaato(i, iIsPro, i5)));
            }
            int i6 = 1 << i4;
            if ((i3 & i6) != 0 && (i2 = (i6 - 1) & i3) >= 64 && !map.containsKey(Integer.valueOf(i2))) {
                map.put(Integer.valueOf(i2), Integer.valueOf(smaato(i, iIsPro, i2)));
            }
        }
    }

    public static C6024l firebase(boolean z) {
        C5034l c5034l = new C5034l();
        c5034l.yandex = VKXApplication.f36631l.getResources().getInteger(R.integer.music_playing_drawable_count);
        c5034l.billing = VKXApplication.f36631l.getResources().getDimensionPixelSize(R.dimen.music_playing_drawable_rect_width);
        c5034l.amazon = VKXApplication.f36631l.getResources().getDimensionPixelSize(R.dimen.music_playing_drawable_rect_height);
        c5034l.purchase = VKXApplication.f36631l.getResources().getDimensionPixelSize(R.dimen.music_playing_drawable_rect_min_height);
        c5034l.loadAd = VKXApplication.f36631l.getResources().getDimensionPixelSize(R.dimen.music_playing_drawable_gap);
        if (z) {
            c5034l.crashlytics = AbstractC13209l.yandex(R.attr.global_accent);
        } else {
            c5034l.crashlytics = VKXApplication.f36631l.getColor(R.color.google_white);
        }
        return new C6024l(c5034l);
    }

    public static String metrica(AbstractC3050l abstractC3050l) {
        if (abstractC3050l instanceof C6294l) {
            return "[".concat(metrica(((C6294l) abstractC3050l).subs));
        }
        if (abstractC3050l instanceof C4285l) {
            EnumC17708l enumC17708l = ((C4285l) abstractC3050l).subs;
            return enumC17708l != null ? enumC17708l.f34520l : "V";
        }
        if (abstractC3050l instanceof C14943l) {
            return AbstractC2812l.tapsense(new StringBuilder("L"), ((C14943l) abstractC3050l).subs, ';');
        }
        C18725l.billing();
        return null;
    }

    public static int smaato(int i, int i2, int i3) {
        int i4 = 1;
        while (i3 >= 32) {
            i4 = (int) ((((4294967295L & ((long) (i2 * i4))) * ((long) i)) + ((long) i4)) >>> 32);
            i3 -= 32;
        }
        if (i3 <= 0) {
            return i4;
        }
        return (int) ((((4294967295L & ((long) ((i2 * i4) & ((-1) >>> (-i3))))) * ((long) i)) + ((long) i4)) >>> i3);
    }

    public static AbstractC3050l subs(String str) {
        EnumC17708l enumC17708l;
        char cCharAt = str.charAt(0);
        EnumC17708l[] enumC17708lArrValues = EnumC17708l.values();
        int length = enumC17708lArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC17708l = null;
                break;
            }
            enumC17708l = enumC17708lArrValues[i];
            if (enumC17708l.f34520l.charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (enumC17708l != null) {
            return new C4285l(enumC17708l);
        }
        if (cCharAt == 'V') {
            return new C4285l(null);
        }
        if (cCharAt == '[') {
            return new C6294l(subs(str.substring(1)));
        }
        if (cCharAt == 'L') {
            AbstractC12024l.m3344synchronized(str, ';');
        }
        return new C14943l(AbstractC1757l.m1035native(1, 1, str));
    }

    public static final int yandex(long j) {
        C14660l c14660l = C3662l.crashlytics;
        if (Long.compare((6917529027641081856L & j) ^ Long.MIN_VALUE, -4611686018427387904L) <= 0) {
            int i = (int) ((j & 9222809086901354496L) >>> 49);
            return i <= 6111 ? i : i - 12288;
        }
        long j2 = Long.MIN_VALUE ^ (8646911284551352320L & j);
        if ((Long.compare(j2, -2305843009213693952L) >= 0) && (Long.compare(j2, -1152921504606846976L) <= 0)) {
            int i2 = (int) ((j & 2305702271725338624L) >>> 47);
            return i2 <= 6111 ? i2 : i2 - 12288;
        }
        C8339l.smaato("getExponent cannot be called for Infinity or NaN.");
        return 0;
    }

    @Override // defpackage.InterfaceC17325l
    public Iterable admob(Object obj) {
        Collection collectionLicense;
        InterfaceC0207l interfaceC0207l = (InterfaceC0207l) obj;
        return (interfaceC0207l == null || (collectionLicense = interfaceC0207l.license()) == null) ? C2580l.f5619l : collectionLicense;
    }

    @Override // defpackage.InterfaceC8982l
    public boolean amazon(SSLSocket sSLSocket) {
        return AbstractC16648l.isVip(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.InterfaceC3990l
    public Rect billing(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            return new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            InterfaceC3990l.loadAd.getClass();
            Log.w(C18496l.loadAd, e);
            return C11140l.f22360l.billing(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        InterfaceC14029l interfaceC14029l = null;
        switch (this.f30515l) {
            case 1:
                C8403l c8403l = c16864l.f32922l;
                C12222l c12222l = C8403l.f17385l;
                C12222l c12222l2 = f30491l;
                c8403l.subs(c12222l, c12222l2);
                c8403l.firebase(c12222l2, new C3341l((Function3) abstractC5563l, interfaceC14029l, 0));
                break;
            default:
                c16864l.f32913l.firebase(C8403l.f17389l, new C14082l((Function5) abstractC5563l, interfaceC14029l, 8));
                break;
        }
    }

    @Override // defpackage.InterfaceC15378l
    public boolean crashlytics(Class cls) {
        return AbstractC15603l.class.isAssignableFrom(cls);
    }

    @Override // defpackage.InterfaceC8982l
    public InterfaceC2332l isPro(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                C8339l.subs(AbstractC0653l.startapp(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                return null;
            }
        }
        return new C3706l(superclass);
    }

    @Override // defpackage.InterfaceC15378l
    public C9025l loadAd(Class cls) {
        if (!AbstractC15603l.class.isAssignableFrom(cls)) {
            C8339l.metrica("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (C9025l) AbstractC15603l.purchase(cls.asSubclass(AbstractC15603l.class)).remoteconfig(3, null);
        } catch (Exception e) {
            C18073l.Signature("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC18565l
    public float mopub(float f) {
        double d = f;
        return (float) (d <= 0.04045d ? d / 12.92d : AbstractC16358l.billing((d + 0.055d) / 1.055d, 2.4d));
    }

    @Override // defpackage.InterfaceC0993l
    public int purchase(int i, int i2, int i3, int i4) {
        return (((i - i3) - i4) / 2) - (i2 / 2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:21:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.io.Serializable remoteconfig(android.content.Context r9, defpackage.AbstractC0283l r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15617l.remoteconfig(android.content.Context, lّؑۧ):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C4169l c4169l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C14407l c14407l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C6279l c6279l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C10045l c10045l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f30515l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C4169l) {
                    c4169l = (C4169l) abstractC0283l;
                    int i2 = c4169l.f8551l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4169l.f8551l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4169l = new C4169l(this, abstractC0283l);
                    }
                } else {
                    c4169l = new C4169l(this, abstractC0283l);
                }
                Object objYandex = c4169l.f8552l;
                int i3 = c4169l.f8551l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(objYandex);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex);
                C14249l c14249lLoadAd = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C0402l.class)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c4169l.f8551l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c4169l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C14407l) {
                    c14407l = (C14407l) abstractC0283l;
                    int i4 = c14407l.f28215l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c14407l.f28215l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c14407l = new C14407l(this, abstractC0283l);
                    }
                } else {
                    c14407l = new C14407l(this, abstractC0283l);
                }
                Object objYandex2 = c14407l.f28216l;
                int i5 = c14407l.f28215l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(objYandex2);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex2);
                C14249l c14249lLoadAd2 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l2 = C0861l.crashlytics;
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C17761l.class)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c14407l.f28215l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c14407l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 15:
                if (abstractC0283l instanceof C6279l) {
                    c6279l = (C6279l) abstractC0283l;
                    int i6 = c6279l.f13236l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c6279l.f13236l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c6279l = new C6279l(this, abstractC0283l);
                    }
                } else {
                    c6279l = new C6279l(this, abstractC0283l);
                }
                Object objYandex3 = c6279l.f13237l;
                int i7 = c6279l.f13236l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(objYandex3);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex3);
                C14249l c14249lLoadAd3 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l3 = C0861l.crashlytics;
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C8366l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c6279l.f13236l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c6279l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return (C0951l) objYandex3;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C10045l) {
                    c10045l = (C10045l) abstractC0283l;
                    int i8 = c10045l.f20491l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10045l.f20491l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10045l = new C10045l(this, abstractC0283l);
                    }
                } else {
                    c10045l = new C10045l(this, abstractC0283l);
                }
                Object objYandex4 = c10045l.f20492l;
                int i9 = c10045l.f20491l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(objYandex4);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex4);
                C14249l c14249lLoadAd4 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd4 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l4 = C0861l.crashlytics;
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C14270l.class)));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c10045l.f20491l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c10045l);
                if (objYandex4 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex4 != null) {
                    return (C0951l) objYandex4;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
        }
    }

    public String toString() {
        switch (this.f30515l) {
            case 11:
                return "Center";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC17806l
    /* JADX INFO: renamed from: try */
    public Boolean mo3763try() {
        return null;
    }

    @Override // defpackage.InterfaceC18565l
    public float vip(float f) {
        double d = f;
        return (float) (d <= 0.0031308d ? d * 12.92d : (AbstractC16358l.billing(d, 0.4166666666666667d) * 1.055d) - 0.055d);
    }

    public /* synthetic */ C15617l(byte b, int i) {
        this.f30515l = i;
    }
}
