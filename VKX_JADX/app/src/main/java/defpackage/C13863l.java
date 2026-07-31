package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.view.Display;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lّٓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13863l implements InterfaceC3990l, InterfaceC2082l, InterfaceC17325l, InterfaceC4446l, InterfaceC5066l, InterfaceC18477l, InterfaceC5152l, InterfaceC13540l, InterfaceC2227l, InterfaceC12613l, InterfaceC8038l, InterfaceC8849l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27123l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C13863l f27109l = new C13863l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C13863l f27102l = new C13863l(2);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C13863l f27115l = new C13863l(3);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C13863l f27114l = new C13863l(4);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C13863l f27118l = new C13863l(5);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C13863l f27103l = new C13863l(6);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C13863l f27106l = new C13863l(7);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C13863l f27117l = new C13863l(8);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C13863l f27112l = new C13863l(9);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C13863l f27119l = new C13863l(10);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C13863l f27116l = new C13863l(11);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C1759l f27101l = new C1759l(10);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C13863l f27120l = new C13863l(13);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C13863l f27113l = new C13863l(14);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C13863l f27107l = new C13863l(15);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C13863l f27111l = new C13863l(16);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C13863l f27121l = new C13863l(17);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final /* synthetic */ C13863l f27110l = new C13863l(18);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C13863l f27105l = new C13863l(19);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C13863l f27104l = new C13863l(20);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C13863l f27100l = new C13863l(21);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C13863l f27122l = new C13863l(22);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C13863l f27108l = new C13863l(23);

    public /* synthetic */ C13863l(int i) {
        this.f27123l = i;
    }

    @Override // defpackage.InterfaceC17325l
    public Iterable admob(Object obj) {
        InterfaceC13922l[] interfaceC13922lArr = C11410l.f22973l;
        return ((InterfaceC0207l) obj).mo864l().license();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (defpackage.AbstractC6025l.yandex(defpackage.C4097l.yandex, r0) == r4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object amazon(long r6, defpackage.AbstractC0283l r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C5860l
            if (r0 == 0) goto L13
            r0 = r8
            lؘٟؑ r0 = (defpackage.C5860l) r0
            int r1 = r0.f12351l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12351l = r1
            goto L18
        L13:
            lؘٟؑ r0 = new lؘٟؑ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.f12352l
            int r8 = r0.f12351l
            r1 = 3
            r2 = 2
            r3 = 1
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r8 == 0) goto L40
            if (r8 == r3) goto L3a
            if (r8 == r2) goto L34
            if (r8 != r1) goto L2d
            defpackage.AbstractC2829l.crashlytics(r5)
            goto L75
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r5)
            r5 = 0
            return r5
        L34:
            long r6 = r0.f12353l
            defpackage.AbstractC2829l.crashlytics(r5)
            goto L66
        L3a:
            long r6 = r0.f12353l
            defpackage.AbstractC2829l.crashlytics(r5)
            goto L52
        L40:
            defpackage.AbstractC2829l.crashlytics(r5)
            lًؙۦ r5 = defpackage.C6336l.yandex
            r0.f12353l = r6
            r0.f12351l = r3
            lُِؗ r5 = defpackage.C6336l.loadAd
            java.lang.Object r5 = r5.m3168l(r0)
            if (r5 != r4) goto L52
            goto L74
        L52:
            lَؗ۠ r5 = (defpackage.C5198l) r5
            lؖٙؓ r8 = new lؖٙؓ
            r3 = 11
            r8.<init>(r6, r3)
            r0.f12353l = r6
            r0.f12351l = r2
            java.lang.Object r5 = r5.m1734l(r8, r0)
            if (r5 != r4) goto L66
            goto L74
        L66:
            lٌؑۤ r5 = defpackage.AbstractC6025l.yandex
            r0.f12353l = r6
            r0.f12351l = r1
            lؚؖٓ r5 = defpackage.C4097l.yandex
            java.lang.Object r5 = defpackage.AbstractC6025l.yandex(r5, r0)
            if (r5 != r4) goto L75
        L74:
            return r4
        L75:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13863l.amazon(long, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3990l
    public Rect billing(Activity activity) {
        int i;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        int i2 = point.x;
        if (i2 == 0 || (i = point.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i2;
        rect.bottom = i;
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        c16864l.f32922l.firebase(C8403l.f17378l, new C7306l((Function4) abstractC5563l, false, null, 7));
    }

    @Override // defpackage.InterfaceC2227l
    public void crashlytics(C11963l c11963l) {
        C13452l c13452l = (C13452l) c11963l.metrica();
        Parcel parcelM743l = c13452l.m743l();
        int i = AbstractC14866l.yandex;
        parcelM743l.writeInt(1);
        AbstractC9968l.Signature(parcelM743l, AbstractC9968l.tapsense(parcelM743l, 20293));
        c13452l.m742l(parcelM743l, 2010);
    }

    @Override // defpackage.InterfaceC5066l
    public String isPro() {
        return "expected an Int value";
    }

    @Override // defpackage.InterfaceC4446l
    public PointF loadAd(C5071l c5071l, int i) {
        float f = c5071l.loadAd;
        float f2 = c5071l.yandex;
        return i == 1 ? new PointF(1.0f - f2, f) : new PointF(f2, f);
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lؘؓؖ */
    public Object mo2330l() {
        return new C16221l(true);
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public Object mo2331l(InputStream inputStream) throws C16916l {
        byte[] bArr;
        try {
            C17760l c17760lStartapp = C17760l.startapp(inputStream);
            C16221l c16221l = new C16221l(false);
            AbstractC0872l[] abstractC0872lArr = (AbstractC0872l[]) Arrays.copyOf(new AbstractC0872l[0], 0);
            c16221l.loadAd();
            if (abstractC0872lArr.length > 0) {
                AbstractC0872l abstractC0872l = abstractC0872lArr[0];
                throw null;
            }
            for (Map.Entry entry : c17760lStartapp.vip().entrySet()) {
                String str = (String) entry.getKey();
                C9721l c9721l = (C9721l) entry.getValue();
                int iAppmetrica = c9721l.appmetrica();
                switch (iAppmetrica == 0 ? -1 : AbstractC2642l.yandex[AbstractC5020l.inmobi(iAppmetrica)]) {
                    case -1:
                        throw new C16916l("Value case is null.", null);
                    case 0:
                    default:
                        C18725l.billing();
                        return null;
                    case 1:
                        c16221l.amazon(new C16033l(str), Boolean.valueOf(c9721l.Signature()));
                        break;
                    case 2:
                        c16221l.amazon(new C16033l(str), Float.valueOf(c9721l.advert()));
                        break;
                    case 3:
                        c16221l.amazon(new C16033l(str), Double.valueOf(c9721l.ad()));
                        break;
                    case 4:
                        c16221l.amazon(new C16033l(str), Integer.valueOf(c9721l.isVip()));
                        break;
                    case 5:
                        c16221l.amazon(new C16033l(str), Long.valueOf(c9721l.signatures()));
                        break;
                    case 6:
                        c16221l.amazon(new C16033l(str), c9721l.premium());
                        break;
                    case 7:
                        c16221l.amazon(new C16033l(str), AbstractC16901l.m4229l(c9721l.applovin().metrica()));
                        break;
                    case 8:
                        C16033l c16033l = new C16033l(str);
                        C4966l c4966lLicense = c9721l.license();
                        int size = c4966lLicense.size();
                        if (size == 0) {
                            bArr = AbstractC4579l.loadAd;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c4966lLicense.admob(size, bArr2);
                            bArr = bArr2;
                        }
                        c16221l.amazon(c16033l, bArr);
                        break;
                    case 9:
                        throw new C16916l("Value not set.", null);
                }
            }
            return c16221l.billing();
        } catch (C5957l e) {
            throw new C16916l("Unable to parse preferences proto.", e);
        }
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٌّۡ */
    public Unit mo2332l(OutputStream outputStream, Object obj) {
        AbstractC8760l abstractC8760lYandex;
        Map mapYandex = ((C16221l) obj).yandex();
        C17348l c17348lMetrica = C17760l.metrica();
        for (Map.Entry entry : mapYandex.entrySet()) {
            C16033l c16033l = (C16033l) entry.getKey();
            Object value = entry.getValue();
            String str = c16033l.yandex;
            if (value instanceof Boolean) {
                C18479l c18479lInmobi = C9721l.inmobi();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                c18479lInmobi.crashlytics();
                C9721l.ads((C9721l) c18479lInmobi.f33585l, zBooleanValue);
                abstractC8760lYandex = c18479lInmobi.yandex();
            } else if (value instanceof Float) {
                C18479l c18479lInmobi2 = C9721l.inmobi();
                float fFloatValue = ((Number) value).floatValue();
                c18479lInmobi2.crashlytics();
                C9721l.subscription((C9721l) c18479lInmobi2.f33585l, fFloatValue);
                abstractC8760lYandex = c18479lInmobi2.yandex();
            } else if (value instanceof Double) {
                C18479l c18479lInmobi3 = C9721l.inmobi();
                double dDoubleValue = ((Number) value).doubleValue();
                c18479lInmobi3.crashlytics();
                C9721l.startapp((C9721l) c18479lInmobi3.f33585l, dDoubleValue);
                abstractC8760lYandex = c18479lInmobi3.yandex();
            } else if (value instanceof Integer) {
                C18479l c18479lInmobi4 = C9721l.inmobi();
                int iIntValue = ((Number) value).intValue();
                c18479lInmobi4.crashlytics();
                C9721l.tapsense((C9721l) c18479lInmobi4.f33585l, iIntValue);
                abstractC8760lYandex = c18479lInmobi4.yandex();
            } else if (value instanceof Long) {
                C18479l c18479lInmobi5 = C9721l.inmobi();
                long jLongValue = ((Number) value).longValue();
                c18479lInmobi5.crashlytics();
                C9721l.remoteconfig((C9721l) c18479lInmobi5.f33585l, jLongValue);
                abstractC8760lYandex = c18479lInmobi5.yandex();
            } else if (value instanceof String) {
                C18479l c18479lInmobi6 = C9721l.inmobi();
                c18479lInmobi6.crashlytics();
                C9721l.vip((C9721l) c18479lInmobi6.f33585l, (String) value);
                abstractC8760lYandex = c18479lInmobi6.yandex();
            } else if (value instanceof Set) {
                C18479l c18479lInmobi7 = C9721l.inmobi();
                C8067l c8067lStartapp = C12790l.startapp();
                c8067lStartapp.crashlytics();
                C12790l.remoteconfig((C12790l) c8067lStartapp.f33585l, (Set) value);
                c18479lInmobi7.crashlytics();
                C9721l.metrica((C9721l) c18479lInmobi7.f33585l, (C12790l) c8067lStartapp.yandex());
                abstractC8760lYandex = c18479lInmobi7.yandex();
            } else {
                if (!(value instanceof byte[])) {
                    C8339l.smaato("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                C18479l c18479lInmobi8 = C9721l.inmobi();
                byte[] bArr = (byte[]) value;
                C4966l c4966lMopub = C4966l.mopub(0, bArr.length, bArr);
                c18479lInmobi8.crashlytics();
                C9721l.adcel((C9721l) c18479lInmobi8.f33585l, c4966lMopub);
                abstractC8760lYandex = c18479lInmobi8.yandex();
            }
            c17348lMetrica.getClass();
            str.getClass();
            c17348lMetrica.crashlytics();
            C17760l.remoteconfig((C17760l) c17348lMetrica.f33585l).put(str, (C9721l) abstractC8760lYandex);
        }
        C17760l c17760l = (C17760l) c17348lMetrica.yandex();
        int iYandex = c17760l.yandex(null);
        Logger logger = C10107l.billing;
        if (iYandex > 4096) {
            iYandex = 4096;
        }
        C10107l c10107l = new C10107l(outputStream, iYandex);
        c17760l.smaato(c10107l);
        if (c10107l.amazon > 0) {
            c10107l.firebase();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC8038l
    public C17032l remoteconfig(C13003l c13003l, C18389l c18389l) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C10869l c10869l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C0645l c0645l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C1065l c1065l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C0773l c0773l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f27123l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C10869l) {
                    c10869l = (C10869l) abstractC0283l;
                    int i2 = c10869l.f21974l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10869l.f21974l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10869l = new C10869l(this, abstractC0283l);
                    }
                } else {
                    c10869l = new C10869l(this, abstractC0283l);
                }
                Object objYandex = c10869l.f21975l;
                int i3 = c10869l.f21974l;
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
                c10869l.f21974l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c10869l);
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
                if (abstractC0283l instanceof C0645l) {
                    c0645l = (C0645l) abstractC0283l;
                    int i4 = c0645l.f2104l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0645l.f2104l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c0645l = new C0645l(this, abstractC0283l);
                    }
                } else {
                    c0645l = new C0645l(this, abstractC0283l);
                }
                Object objYandex2 = c0645l.f2105l;
                int i5 = c0645l.f2104l;
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
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C2757l.class)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c0645l.f2104l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c0645l);
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
                if (abstractC0283l instanceof C1065l) {
                    c1065l = (C1065l) abstractC0283l;
                    int i6 = c1065l.f2945l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1065l.f2945l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1065l = new C1065l(this, abstractC0283l);
                    }
                } else {
                    c1065l = new C1065l(this, abstractC0283l);
                }
                Object objYandex3 = c1065l.f2946l;
                int i7 = c1065l.f2945l;
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
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C7575l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c1065l.f2945l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c1065l);
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
                if (abstractC0283l instanceof C0773l) {
                    c0773l = (C0773l) abstractC0283l;
                    int i8 = c0773l.f2353l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0773l.f2353l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c0773l = new C0773l(this, abstractC0283l);
                    }
                } else {
                    c0773l = new C0773l(this, abstractC0283l);
                }
                Object objYandex4 = c0773l.f2354l;
                int i9 = c0773l.f2353l;
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
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.loadAd(List.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C8880l.class)))));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c0773l.f2353l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c0773l);
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
        switch (this.f27123l) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC8849l
    public byte[] yandex(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.InterfaceC2082l
    public void lock() {
    }

    @Override // defpackage.InterfaceC2082l
    public void unlock() {
    }
}
