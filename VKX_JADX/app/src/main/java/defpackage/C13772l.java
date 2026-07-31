package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Display;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lّْۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13772l implements InterfaceC9630l, InterfaceC3990l, InterfaceC15446l, InterfaceC17806l, InterfaceC9407l, InterfaceC12954l, InterfaceC0957l, InterfaceC13540l, InterfaceC11545l, InterfaceC12165l, InterfaceC0240l, InterfaceC10120l, InterfaceC13037l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26887l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C13772l f26873l = new C13772l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C13772l f26867l = new C13772l(2);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C13772l f26879l = new C13772l(3);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C13772l f26878l = new C13772l(4);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C13772l f26882l = new C13772l(5);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C13772l f26868l = new C13772l(6);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C13772l f26871l = new C13772l(7);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C13772l f26881l = new C13772l(8);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C13772l f26876l = new C13772l(10);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C13772l f26883l = new C13772l(11);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C13772l f26880l = new C13772l(12);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C13772l f26866l = new C13772l(13);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C13772l f26884l = new C13772l(14);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C13772l f26877l = new C13772l(15);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C13772l f26872l = new C13772l(16);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C13772l f26875l = new C13772l(17);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final /* synthetic */ C13772l f26885l = new C13772l(18);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C13772l f26874l = new C13772l(19);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C13772l f26870l = new C13772l(20);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C13772l f26869l = new C13772l(21);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C13772l f26865l = new C13772l(22);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C13772l f26886l = new C13772l(23);

    public /* synthetic */ C13772l(int i) {
        this.f26887l = i;
    }

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public static /* synthetic */ Object m3753l(AppActivity appActivity, String str, String str2, String str3, String str4, boolean z, AbstractC5563l abstractC5563l, int i) {
        if ((i & 16) != 0) {
            str4 = null;
        }
        String str5 = str4;
        if ((i & 32) != 0) {
            z = false;
        }
        C14054l c14054l = C14054l.f27396l;
        return f26881l.m3762l(appActivity, str, str2, str3, str5, z, c14054l, abstractC5563l);
    }

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public static int m3754l(EnumC4183l enumC4183l) {
        int i = enumC4183l == null ? -1 : AbstractC4029l.yandex[enumC4183l.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public static void m3755l(List list, Function1 function1) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NewsfeedItem newsfeedItem = (NewsfeedItem) it.next();
            List list2 = newsfeedItem.remoteconfig;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    function1.invoke(it2.next());
                }
            }
            function1.invoke(newsfeedItem);
        }
    }

    @Override // defpackage.InterfaceC9630l
    public Collection Signature(InterfaceC17477l interfaceC17477l) {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: abstract */
    public boolean mo1158abstract(InterfaceC0583l interfaceC0583l) {
        AbstractC15211l abstractC15211lMopub = AbstractC13095l.mopub(interfaceC0583l);
        return (abstractC15211lMopub != null ? mo1213return(abstractC15211lMopub) : null) != null;
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C13452l c13452l = (C13452l) ((C11963l) obj).metrica();
        Parcel parcelM743l = c13452l.m743l();
        int i = AbstractC14866l.yandex;
        parcelM743l.writeInt(1);
        AbstractC9968l.Signature(parcelM743l, AbstractC9968l.tapsense(parcelM743l, 20293));
        c13452l.m742l(parcelM743l, 2004);
        ((C2350l) obj2).loadAd(Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC14555l
    public boolean ad(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.premium(AbstractC13095l.m3542import(interfaceC0583l));
    }

    @Override // defpackage.InterfaceC14555l
    public void adcel(InterfaceC13789l interfaceC13789l) {
        AbstractC13095l.billing(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC14555l
    public boolean admob(InterfaceC13340l interfaceC13340l) {
        return interfaceC13340l instanceof C18655l;
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC13789l ads(InterfaceC0218l interfaceC0218l) {
        return AbstractC13095l.tapsense(this, interfaceC0218l);
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC0218l advert(InterfaceC0583l interfaceC0583l, int i) {
        if (i < 0 || i >= AbstractC13095l.loadAd(interfaceC0583l)) {
            return null;
        }
        return AbstractC13095l.remoteconfig(interfaceC0583l, i);
    }

    @Override // defpackage.InterfaceC9630l
    public Collection amazon(C3498l c3498l, InterfaceC17477l interfaceC17477l) {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC9630l
    public Collection applovin(InterfaceC17477l interfaceC17477l) {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ Collection appmetrica(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.m3541goto(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC3990l
    public Rect billing(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!AbstractC11965l.ads(activity)) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
                return rect;
            }
            int i2 = rect.right + dimensionPixelSize;
            if (i2 == point.x) {
                rect.right = i2;
            }
        }
        return rect;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: break */
    public /* bridge */ boolean mo1159break(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.m3547package(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: case */
    public /* bridge */ void mo1160case(InterfaceC0583l interfaceC0583l) {
        AbstractC13095l.m3555throw(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: catch */
    public /* bridge */ Collection mo1161catch(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3544interface(this, interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: class */
    public InterfaceC0583l mo1162class(InterfaceC13789l interfaceC13789l) {
        AbstractC15211l abstractC15211lM3531abstract;
        AbstractC4317l abstractC4317lBilling = AbstractC13095l.billing(interfaceC13789l);
        return (abstractC4317lBilling == null || (abstractC15211lM3531abstract = AbstractC13095l.m3531abstract(abstractC4317lBilling)) == null) ? AbstractC13095l.mopub(interfaceC13789l) : abstractC15211lM3531abstract;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: const */
    public /* bridge */ InterfaceC0583l mo1163const(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.mopub(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC9407l
    /* JADX INFO: renamed from: continue */
    public void mo1227continue(InterfaceC17477l interfaceC17477l, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC17477l.getName() + ", unresolved classes " + arrayList);
    }

    @Override // defpackage.InterfaceC9630l
    public Collection crashlytics(InterfaceC17477l interfaceC17477l) {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC12165l
    /* JADX INFO: renamed from: default */
    public C10537l mo3369default() {
        return new C10537l(Collections.singletonList(new C9293l(Locale.getDefault())));
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: else */
    public InterfaceC13789l mo1164else(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.m3535continue(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC9407l
    /* JADX INFO: renamed from: extends */
    public void mo1228extends(InterfaceC0207l interfaceC0207l) {
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC0207l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: final */
    public /* bridge */ InterfaceC0218l mo1165final(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.admob(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: finally */
    public /* bridge */ InterfaceC5272l mo1166finally(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.billing(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC0583l firebase(InterfaceC5272l interfaceC5272l) {
        return AbstractC13095l.m3531abstract(interfaceC5272l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: for */
    public boolean mo1167for(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3547package(AbstractC13095l.m3542import(interfaceC0583l));
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: goto */
    public /* bridge */ boolean mo1168goto(InterfaceC0583l interfaceC0583l, InterfaceC0583l interfaceC0583l2) {
        return AbstractC13095l.isVip(interfaceC0583l, interfaceC0583l2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public Object m3756implements(AppActivity appActivity, C17889l c17889l, AbstractC0283l abstractC0283l) throws Throwable {
        C3311l c3311l;
        C2106l c2106lLoadAd;
        AppActivity appActivity2;
        if (abstractC0283l instanceof C3311l) {
            c3311l = (C3311l) abstractC0283l;
            int i = c3311l.f7062l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3311l.f7062l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3311l = new C3311l(this, abstractC0283l);
            }
        } else {
            c3311l = new C3311l(this, abstractC0283l);
        }
        Object obj = c3311l.f7063l;
        int i2 = c3311l.f7062l;
        int i3 = 1;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            ArrayList arrayList = AbstractC18569l.yandex;
            C7644l c7644lLoadAd = AbstractC16584l.loadAd();
            C4645l c4645l = (C4645l) c7644lLoadAd.f15735l;
            long j = c17889l.yandex;
            String str = c17889l.loadAd;
            int i4 = c17889l.crashlytics;
            if (i4 > 1000000) {
                C2106l c2106l = C2106l.f4733l;
                c2106lLoadAd = C16367l.license(i4, 0L);
            } else {
                C2106l c2106lPurchase = AbstractC7866l.yandex.purchase();
                C6760l c6760l = C9658l.f19699l;
                c2106lLoadAd = c2106lPurchase.loadAd(AbstractC15918l.tapsense(i4, EnumC16636l.SECONDS));
            }
            C4645l c4645lYandex = C4645l.yandex(c4645l, j, str, c2106lLoadAd, c17889l.amazon, null, null, null, null, null, null, true, 1008);
            AbstractC2238l.isPro((C7026l) c7644lLoadAd.f15742l, c4645lYandex);
            c7644lLoadAd.f15735l = c4645lYandex;
            C7644l c7644lLoadAd2 = AbstractC16584l.loadAd();
            c3311l.f7064l = appActivity;
            c3311l.f7062l = 1;
            if (c7644lLoadAd2.adcel(c3311l) != enumC9342l) {
                appActivity2 = appActivity;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        appActivity2 = c3311l.f7064l;
        AbstractC2829l.crashlytics(obj);
        C16552l c16552l = AbstractC11463l.yandex;
        C2975l c2975l = AbstractC17278l.yandex.f6462l;
        C14019l c14019l = new C14019l(appActivity2, interfaceC14029l, i3);
        c3311l.f7064l = null;
        c3311l.f7062l = 2;
        Object objFirebase = AbstractC10999l.firebase(c2975l, c14019l, c3311l);
        return objFirebase == enumC9342l ? enumC9342l : objFirebase;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: import */
    public /* bridge */ boolean mo1169import(InterfaceC2224l interfaceC2224l, InterfaceC2224l interfaceC2224l2) {
        return AbstractC13095l.yandex(interfaceC2224l, interfaceC2224l2);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean inmobi(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.appmetrica(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: instanceof */
    public boolean mo1170instanceof(InterfaceC13789l interfaceC13789l) {
        return interfaceC13789l instanceof C7530l;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: interface */
    public /* bridge */ InterfaceC13340l mo1171interface(InterfaceC6913l interfaceC6913l) {
        return AbstractC13095l.amazon(this, interfaceC6913l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC0583l isPro(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3549public(interfaceC0583l, false);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ int isVip(InterfaceC13199l interfaceC13199l) {
        return AbstractC13095l.ad(interfaceC13199l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean license(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.premium(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC0240l
    public void loadAd(C11442l c11442l) {
        c11442l.adcel("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int i = 0;
        Object[] objArr = new Object[0];
        if (contentValues.size() == 0) {
            C8339l.metrica("Empty values");
            return;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(C11442l.f23025l[3]);
        sb.append("WorkSpec SET ");
        int i2 = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str);
            objArr2[i2] = contentValues.get(str);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        C8008l c8008lMopub = c11442l.mopub(sb.toString());
        while (i < length) {
            Object obj = objArr2[i];
            i++;
            if (obj == null) {
                c8008lMopub.metrica(i);
            } else if (obj instanceof byte[]) {
                c8008lMopub.smaato(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                c8008lMopub.mo669l(((Number) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                c8008lMopub.mo669l(((Number) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                c8008lMopub.firebase(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                c8008lMopub.firebase(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                c8008lMopub.firebase(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                c8008lMopub.firebase(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                c8008lMopub.applovin(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                c8008lMopub.firebase(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        c8008lMopub.f16687l.executeUpdateDelete();
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؚۣؒ */
    public /* bridge */ boolean mo1173l(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.m3551strictfp(interfaceC13789l);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public Serializable m3757l(C13698l c13698l, C4645l c4645l, AbstractC0283l abstractC0283l) {
        C10083l c10083l;
        Serializable c18435l;
        Throwable thYandex;
        Object obj;
        C18031l c18031l;
        int i;
        Object objAd;
        C13698l c13698l2 = c13698l;
        C4645l c4645l2 = c4645l;
        if (abstractC0283l instanceof C10083l) {
            c10083l = (C10083l) abstractC0283l;
            int i2 = c10083l.f20561l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10083l.f20561l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10083l = new C10083l(this, abstractC0283l);
            }
        } else {
            c10083l = new C10083l(this, abstractC0283l);
        }
        Object obj2 = c10083l.f20560l;
        int i3 = c10083l.f20561l;
        C3844l c3844l = C3844l.f7950l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            try {
                if (i3 != 0) {
                    if (i3 == 1) {
                        int i4 = c10083l.f20559l;
                        C18031l c18031l2 = c10083l.f20565l;
                        C4645l c4645l3 = c10083l.f20562l;
                        C13698l c13698l3 = c10083l.f20563l;
                        AbstractC2829l.crashlytics(obj2);
                        Object obj3 = ((C1171l) obj2).f3160l;
                        i = i4;
                        c13698l2 = c13698l3;
                        obj = obj3;
                        c18031l = c18031l2;
                        c4645l2 = c4645l3;
                    } else {
                        if (i3 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj2);
                        objAd = ((C1171l) obj2).f3160l;
                    }
                    AbstractC2829l.crashlytics(objAd);
                    c18435l = Boolean.valueOf(((C12788l) objAd).f25164l);
                    thYandex = C1171l.yandex(c18435l);
                    if (thYandex != null) {
                        thYandex.printStackTrace();
                    }
                    return c18435l;
                }
                AbstractC2829l.crashlytics(obj2);
                C18031l c18031l3 = new C18031l(c4645l2.yandex, "vk", c3844l);
                AbstractC0018l.yandex();
                C12102l c12102l = new C12102l(c18031l3, c3844l);
                c10083l.f20563l = c13698l2;
                c10083l.f20562l = c4645l2;
                c10083l.f20565l = c18031l3;
                c10083l.f20559l = 0;
                c10083l.f20561l = 1;
                Serializable serializableM3670default = c13698l2.m3670default(c12102l, c10083l);
                if (serializableM3670default == enumC9342l) {
                    return enumC9342l;
                }
                obj = serializableM3670default;
                c18031l = c18031l3;
                i = 0;
                C8082l c8082lM2257synchronized = C8082l.m2257synchronized(((C5552l) obj).f11837l.subscription(), C7597l.yandex());
                C2494l.m1151l(c8082lM2257synchronized);
                InterfaceC10634l interfaceC10634l = (InterfaceC10634l) C2494l.m1152l(c8082lM2257synchronized).m1179l(InterfaceC10634l.class);
                C10705l c10705l = AbstractC14790l.crashlytics;
                c10705l.getClass();
                byte[] bArrYandex = interfaceC10634l.yandex(c10705l.loadAd(C4645l.Companion.serializer(), c4645l2));
                int length = bArrYandex.length;
                AbstractC9334l.crashlytics(bArrYandex.length, 0L, length);
                C16210l c16210l = new C16210l(c18031l, new C3844l(AbstractC8669l.inmobi(0, length, bArrYandex)), c3844l);
                c10083l.f20563l = null;
                c10083l.f20562l = null;
                c10083l.f20565l = null;
                c10083l.f20559l = i;
                c10083l.f20561l = 2;
                objAd = c13698l2.ad(c16210l, c10083l);
                if (objAd == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC2829l.crashlytics(objAd);
                c18435l = Boolean.valueOf(((C12788l) objAd).f25164l);
            } catch (C2297l unused) {
                throw new GeneralSecurityException("invalid keyset");
            }
            AbstractC2829l.crashlytics(obj);
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        thYandex = C1171l.yandex(c18435l);
        if (thYandex != null) {
            thYandex.printStackTrace();
        }
        return c18435l;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؒۢۜ */
    public /* bridge */ InterfaceC6440l mo1174l(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.crashlytics(interfaceC0583l);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b7 A[Catch: Exception -> 0x00d7, TryCatch #0 {Exception -> 0x00d7, blocks: (B:13:0x0030, B:37:0x00d4, B:18:0x003d, B:30:0x00af, B:32:0x00b7, B:34:0x00c3, B:21:0x0043, B:27:0x005c, B:24:0x004d), top: B:42:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3 A[Catch: Exception -> 0x00d7, TryCatch #0 {Exception -> 0x00d7, blocks: (B:13:0x0030, B:37:0x00d4, B:18:0x003d, B:30:0x00af, B:32:0x00b7, B:34:0x00c3, B:21:0x0043, B:27:0x005c, B:24:0x004d), top: B:42:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        if (r0.adcel(r2) == r8) goto L36;
     */
    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m3758l(java.lang.String r24, defpackage.AbstractC0283l r25) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13772l.m3758l(java.lang.String, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؔٙؕ */
    public /* bridge */ boolean mo1178l(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.applovin(interfaceC2224l);
    }

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public C5425l m3759l() {
        return AbstractC16131l.yandex(false, this, null, 24);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public /* bridge */ boolean mo1186l(InterfaceC13340l interfaceC13340l) {
        return AbstractC13095l.m3538extends(interfaceC13340l);
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public InterfaceC13789l m3760l(InterfaceC13789l interfaceC13789l) {
        AbstractC15211l abstractC15211lM3549public;
        AbstractC15211l abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l);
        return (abstractC15211lMopub == null || (abstractC15211lM3549public = AbstractC13095l.m3549public(abstractC15211lMopub, true)) == null) ? interfaceC13789l : abstractC15211lM3549public;
    }

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public boolean m3761l(InterfaceC13789l interfaceC13789l, C2312l c2312l) {
        if (interfaceC13789l instanceof AbstractC18041l) {
            return ((AbstractC18041l) interfaceC13789l).getAnnotations().isPro(c2312l);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13789l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
        return false;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public boolean mo1192l(InterfaceC13789l interfaceC13789l) {
        return !AbstractC8576l.yandex(AbstractC13095l.m3542import(signatures(interfaceC13789l)), AbstractC13095l.m3542import(mo1162class(interfaceC13789l)));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x037e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0382  */
    /* JADX WARN: Code duplicated, block: B:105:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:107:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:109:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:112:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:114:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:116:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:28:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0103  */
    /* JADX WARN: Code duplicated, block: B:30:0x0106  */
    /* JADX WARN: Code duplicated, block: B:34:0x018d  */
    /* JADX WARN: Code duplicated, block: B:37:0x019b  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x0216  */
    /* JADX WARN: Code duplicated, block: B:57:0x021e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0298  */
    /* JADX WARN: Code duplicated, block: B:64:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:70:0x02dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x02de  */
    /* JADX WARN: Code duplicated, block: B:73:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x02fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0306  */
    /* JADX WARN: Code duplicated, block: B:83:0x0309  */
    /* JADX WARN: Code duplicated, block: B:84:0x030c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0326  */
    /* JADX WARN: Code duplicated, block: B:88:0x032a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x0334  */
    /* JADX WARN: Code duplicated, block: B:92:0x033c  */
    /* JADX WARN: Code duplicated, block: B:97:0x035a  */
    /* JADX WARN: Code duplicated, block: B:99:0x035e  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x020f, code lost:
    
        if (r1 == r9) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0354, code lost:
    
        if (m3756implements(r10, r1, r8) == r9) goto L94;
     */
    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m3762l(ua.itaysonlab.vkx.activity.AppActivity r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, java.util.Map r26, defpackage.AbstractC0283l r27) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13772l.m3762l(ua.itaysonlab.vkx.activity.AppActivity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.Map, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC12954l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public /* bridge */ AbstractC14318l mo1194l(InterfaceC6913l interfaceC6913l, InterfaceC6913l interfaceC6913l2) {
        return AbstractC13095l.firebase(this, interfaceC6913l, interfaceC6913l2);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lٕؓٗ */
    public /* bridge */ InterfaceC13789l mo1195l(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.m3543instanceof(this, interfaceC13789l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lَٖؔ */
    public InterfaceC0218l mo1197l(InterfaceC6440l interfaceC6440l, int i) {
        if (interfaceC6440l instanceof InterfaceC6913l) {
            return AbstractC13095l.remoteconfig((InterfaceC13789l) interfaceC6440l, i);
        }
        if (interfaceC6440l instanceof C8469l) {
            return (InterfaceC0218l) ((C8469l) interfaceC6440l).get(i);
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC6440l);
        C11983l.adcel(sb, AbstractC18202l.yandex.loadAd(interfaceC6440l.getClass()));
        return null;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lَٖؕ */
    public /* bridge */ InterfaceC0218l mo1199l(InterfaceC13789l interfaceC13789l, int i) {
        return AbstractC13095l.remoteconfig(interfaceC13789l, i);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؙٗٙ */
    public /* bridge */ boolean mo1203l(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.m3557volatile(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public /* bridge */ boolean mo1205l(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.signatures(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    public int metrica(InterfaceC6440l interfaceC6440l) {
        if (interfaceC6440l instanceof InterfaceC0583l) {
            return AbstractC13095l.loadAd((InterfaceC13789l) interfaceC6440l);
        }
        if (interfaceC6440l instanceof C8469l) {
            return ((C8469l) interfaceC6440l).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC6440l);
        C11983l.adcel(sb, AbstractC18202l.yandex.loadAd(interfaceC6440l.getClass()));
        return 0;
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ int mopub(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.loadAd(interfaceC13789l);
    }

    @Override // defpackage.InterfaceC12954l
    /* JADX INFO: renamed from: native */
    public /* bridge */ AbstractC15211l mo1207native(AbstractC18041l abstractC18041l) {
        return AbstractC13095l.mopub(abstractC18041l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: new */
    public /* bridge */ InterfaceC0218l mo1208new(InterfaceC1633l interfaceC1633l) {
        return AbstractC13095l.m3550static(interfaceC1633l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: package */
    public /* bridge */ InterfaceC2224l mo1209package(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3542import(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC13789l premium(InterfaceC13340l interfaceC13340l) {
        return AbstractC13095l.m3553switch(interfaceC13340l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: private */
    public boolean mo1210private(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.purchase(interfaceC0583l) != null;
    }

    @Override // defpackage.InterfaceC14555l
    public boolean pro(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3557volatile(mo1219this(interfaceC0583l)) && !AbstractC13095l.m3545native(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: protected */
    public /* bridge */ InterfaceC0583l mo1211protected(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.subs(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: public */
    public /* bridge */ void mo1212public(InterfaceC0583l interfaceC0583l) {
        AbstractC13095l.m3533catch(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean purchase(InterfaceC13199l interfaceC13199l, InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.advert(interfaceC13199l, interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean remoteconfig(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.inmobi(interfaceC0583l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: return */
    public InterfaceC13340l mo1213return(InterfaceC0583l interfaceC0583l) {
        InterfaceC6913l interfaceC6913l;
        C15110l c15110lPurchase = AbstractC13095l.purchase(interfaceC0583l);
        if (c15110lPurchase == null || (interfaceC6913l = c15110lPurchase.f29644l) == null) {
            interfaceC6913l = (InterfaceC6913l) interfaceC0583l;
        }
        return AbstractC13095l.amazon(this, interfaceC6913l);
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC0583l signatures(InterfaceC13789l interfaceC13789l) {
        AbstractC15211l abstractC15211lM3532case;
        AbstractC4317l abstractC4317lBilling = AbstractC13095l.billing(interfaceC13789l);
        return (abstractC4317lBilling == null || (abstractC15211lM3532case = AbstractC13095l.m3532case(abstractC4317lBilling)) == null) ? AbstractC13095l.mopub(interfaceC13789l) : abstractC15211lM3532case;
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC0583l smaato(InterfaceC5272l interfaceC5272l) {
        return AbstractC13095l.m3532case(interfaceC5272l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ int startapp(InterfaceC0218l interfaceC0218l) {
        return AbstractC13095l.pro(interfaceC0218l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: static */
    public InterfaceC13789l mo1214static(ArrayList arrayList) {
        return AbstractC5712l.crashlytics(arrayList);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: strictfp */
    public boolean mo1215strictfp(InterfaceC13789l interfaceC13789l) {
        return AbstractC13095l.m3551strictfp(signatures(interfaceC13789l)) != AbstractC13095l.m3551strictfp(mo1162class(interfaceC13789l));
    }

    @Override // defpackage.InterfaceC12954l
    public AbstractC16860l subs() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean subscription(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.m3554synchronized(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: super */
    public /* bridge */ InterfaceC13199l mo1216super(InterfaceC2224l interfaceC2224l, int i) {
        return AbstractC13095l.adcel(interfaceC2224l, i);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: switch */
    public /* bridge */ int mo1217switch(InterfaceC2224l interfaceC2224l) {
        return AbstractC13095l.m3534class(interfaceC2224l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: synchronized */
    public /* bridge */ int mo1218synchronized(InterfaceC13340l interfaceC13340l) {
        return AbstractC13095l.isPro(interfaceC13340l);
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ InterfaceC1633l tapsense(InterfaceC13340l interfaceC13340l) {
        return AbstractC13095l.m3552super(interfaceC13340l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: this */
    public InterfaceC2224l mo1219this(InterfaceC13789l interfaceC13789l) {
        InterfaceC0583l interfaceC0583lMopub = AbstractC13095l.mopub(interfaceC13789l);
        if (interfaceC0583lMopub == null) {
            interfaceC0583lMopub = signatures(interfaceC13789l);
        }
        return AbstractC13095l.m3542import(interfaceC0583lMopub);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: throw */
    public /* bridge */ AbstractC12027l mo1220throw(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3546new(this, interfaceC0583l);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C16324l c16324l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C8432l c8432l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C17504l c17504l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C13054l c13054l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f26887l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C16324l) {
                    c16324l = (C16324l) abstractC0283l;
                    int i2 = c16324l.f31917l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16324l.f31917l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16324l = new C16324l(this, abstractC0283l);
                    }
                } else {
                    c16324l = new C16324l(this, abstractC0283l);
                }
                Object objYandex = c16324l.f31918l;
                int i3 = c16324l.f31917l;
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
                c16324l.f31917l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c16324l);
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
                if (abstractC0283l instanceof C8432l) {
                    c8432l = (C8432l) abstractC0283l;
                    int i4 = c8432l.f17440l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c8432l.f17440l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c8432l = new C8432l(this, abstractC0283l);
                    }
                } else {
                    c8432l = new C8432l(this, abstractC0283l);
                }
                Object objYandex2 = c8432l.f17441l;
                int i5 = c8432l.f17440l;
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
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C5619l.class)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c8432l.f17440l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c8432l);
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
                if (abstractC0283l instanceof C17504l) {
                    c17504l = (C17504l) abstractC0283l;
                    int i6 = c17504l.f34099l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c17504l.f34099l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c17504l = new C17504l(this, abstractC0283l);
                    }
                } else {
                    c17504l = new C17504l(this, abstractC0283l);
                }
                Object objYandex3 = c17504l.f34100l;
                int i7 = c17504l.f34099l;
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
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C14578l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c17504l.f34099l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c17504l);
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
                if (abstractC0283l instanceof C13054l) {
                    c13054l = (C13054l) abstractC0283l;
                    int i8 = c13054l.f25567l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c13054l.f25567l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c13054l = new C13054l(this, abstractC0283l);
                    }
                } else {
                    c13054l = new C13054l(this, abstractC0283l);
                }
                Object objYandex4 = c13054l.f25568l;
                int i9 = c13054l.f25567l;
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
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(Integer.TYPE)));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c13054l.f25567l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c13054l);
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
        switch (this.f26887l) {
            case 4:
                return "{}";
            case 12:
                int i = AbstractC18114l.f35409l;
                return "TimeSource(System.nanoTime())";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC0957l
    /* JADX INFO: renamed from: transient */
    public C4663l mo765transient() {
        return new C4663l(AbstractC18114l.yandex());
    }

    @Override // defpackage.InterfaceC17806l
    /* JADX INFO: renamed from: try, reason: not valid java name */
    public Boolean mo3763try() {
        return Boolean.TRUE;
    }

    @Override // defpackage.InterfaceC14555l
    public /* bridge */ boolean vip(InterfaceC0218l interfaceC0218l) {
        return AbstractC13095l.m3540for(interfaceC0218l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: volatile */
    public boolean mo1223volatile(InterfaceC13789l interfaceC13789l) {
        AbstractC15211l abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l);
        return (abstractC15211lMopub != null ? AbstractC13095l.purchase(abstractC15211lMopub) : null) != null;
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public void m3764while(InterfaceC3905l interfaceC3905l) {
        interfaceC3905l.subs(C9979l.class, C17343l.yandex);
        interfaceC3905l.subs(C14867l.class, C7898l.yandex);
        interfaceC3905l.subs(AbstractC9549l.class, C14253l.yandex);
        interfaceC3905l.subs(AbstractC1788l.class, C12615l.yandex);
        interfaceC3905l.subs(AbstractC10409l.class, C13014l.yandex);
        interfaceC3905l.subs(AbstractC10802l.class, C11269l.yandex);
        interfaceC3905l.subs(AbstractC13041l.class, C8521l.yandex);
        interfaceC3905l.subs(AbstractC13457l.class, C12531l.yandex);
        interfaceC3905l.subs(C14215l.class, C6574l.yandex);
        interfaceC3905l.subs(AbstractC11994l.class, C11493l.yandex);
        interfaceC3905l.subs(AbstractC5711l.class, C16037l.yandex);
        interfaceC3905l.subs(AbstractC0441l.class, C12025l.yandex);
        interfaceC3905l.subs(AbstractC4115l.class, C5881l.yandex);
        interfaceC3905l.subs(AbstractC17332l.class, C10204l.yandex);
        interfaceC3905l.subs(C8273l.class, C12883l.yandex);
        interfaceC3905l.subs(AbstractC6745l.class, C6397l.yandex);
        interfaceC3905l.subs(AbstractC14566l.class, C11366l.yandex);
        interfaceC3905l.subs(AbstractC12359l.class, C8980l.yandex);
        interfaceC3905l.subs(AbstractC3461l.class, C18462l.yandex);
        interfaceC3905l.subs(AbstractC4654l.class, C4719l.yandex);
        interfaceC3905l.subs(C3246l.class, C0881l.yandex);
        interfaceC3905l.subs(C2401l.class, C17899l.yandex);
        interfaceC3905l.subs(C17080l.class, C12471l.yandex);
        interfaceC3905l.subs(AbstractC13402l.class, C12929l.yandex);
        interfaceC3905l.subs(AbstractC16164l.class, C12775l.yandex);
        interfaceC3905l.subs(AbstractC9690l.class, C18736l.yandex);
        interfaceC3905l.subs(AbstractC10478l.class, C15522l.yandex);
        interfaceC3905l.subs(AbstractC8513l.class, C6131l.yandex);
        interfaceC3905l.subs(AbstractC10033l.class, C3221l.yandex);
        interfaceC3905l.subs(AbstractC10114l.class, C4765l.yandex);
        interfaceC3905l.subs(AbstractC12081l.class, C11937l.yandex);
        interfaceC3905l.subs(AbstractC13095l.class, C6723l.yandex);
        interfaceC3905l.subs(AbstractC9968l.class, C9136l.yandex);
        interfaceC3905l.subs(AbstractC14460l.class, C7937l.yandex);
        interfaceC3905l.subs(AbstractC2219l.class, C9352l.yandex);
        interfaceC3905l.subs(AbstractC1896l.class, C17303l.yandex);
        interfaceC3905l.subs(AbstractC15497l.class, C11866l.yandex);
        interfaceC3905l.subs(AbstractC13611l.class, C12566l.yandex);
        interfaceC3905l.subs(AbstractC16837l.class, C16615l.yandex);
        interfaceC3905l.subs(AbstractC1135l.class, C6008l.yandex);
        interfaceC3905l.subs(AbstractC16336l.class, C7372l.yandex);
        interfaceC3905l.subs(AbstractC13766l.class, C9112l.yandex);
        interfaceC3905l.subs(AbstractC13628l.class, C13405l.yandex);
        interfaceC3905l.subs(AbstractC16817l.class, C5893l.yandex);
        interfaceC3905l.subs(AbstractC11790l.class, C9479l.yandex);
        interfaceC3905l.subs(AbstractC15901l.class, C6929l.yandex);
        interfaceC3905l.subs(AbstractC3586l.class, C6838l.yandex);
        interfaceC3905l.subs(AbstractC4918l.class, C9996l.yandex);
        interfaceC3905l.subs(AbstractC0714l.class, C10473l.yandex);
        interfaceC3905l.subs(AbstractC7310l.class, C5105l.yandex);
        interfaceC3905l.subs(AbstractC2749l.class, C3361l.yandex);
        interfaceC3905l.subs(AbstractC10547l.class, C11198l.yandex);
        interfaceC3905l.subs(AbstractC13880l.class, C0108l.yandex);
        interfaceC3905l.subs(AbstractC10464l.class, C12068l.yandex);
        interfaceC3905l.subs(AbstractC3383l.class, C4528l.yandex);
        interfaceC3905l.subs(AbstractC0555l.class, C15527l.yandex);
        interfaceC3905l.subs(AbstractC17824l.class, C6979l.yandex);
        interfaceC3905l.subs(AbstractC5578l.class, C11711l.yandex);
        interfaceC3905l.subs(C5795l.class, C3197l.yandex);
        interfaceC3905l.subs(AbstractC6889l.class, C13903l.yandex);
        interfaceC3905l.subs(AbstractC15960l.class, C17453l.yandex);
        interfaceC3905l.subs(AbstractC15422l.class, C17060l.yandex);
        interfaceC3905l.subs(C17423l.class, C4066l.yandex);
        interfaceC3905l.subs(C6859l.class, C2075l.yandex);
        interfaceC3905l.subs(AbstractC6725l.class, C5167l.yandex);
        interfaceC3905l.subs(AbstractC7902l.class, C3833l.yandex);
        interfaceC3905l.subs(AbstractC0079l.class, C10342l.yandex);
        interfaceC3905l.subs(C16050l.class, C0621l.yandex);
        interfaceC3905l.subs(C17342l.class, C14914l.yandex);
        interfaceC3905l.subs(C15131l.class, C16255l.yandex);
        interfaceC3905l.subs(AbstractC17742l.class, C7086l.yandex);
        interfaceC3905l.subs(AbstractC7985l.class, C18453l.yandex);
        interfaceC3905l.subs(AbstractC5103l.class, C6274l.yandex);
        interfaceC3905l.subs(AbstractC4311l.class, C12542l.yandex);
        interfaceC3905l.subs(AbstractC14775l.class, C1523l.yandex);
        interfaceC3905l.subs(AbstractC4959l.class, C18550l.yandex);
        interfaceC3905l.subs(AbstractC1213l.class, C15515l.yandex);
        interfaceC3905l.subs(AbstractC8853l.class, C12944l.yandex);
        interfaceC3905l.subs(AbstractC11048l.class, C9545l.yandex);
        interfaceC3905l.subs(AbstractC8016l.class, C5409l.yandex);
        interfaceC3905l.subs(AbstractC2021l.class, C18639l.yandex);
        interfaceC3905l.subs(AbstractC13831l.class, C16773l.yandex);
        interfaceC3905l.subs(AbstractC6900l.class, C11901l.yandex);
        interfaceC3905l.subs(AbstractC4603l.class, C7031l.yandex);
        interfaceC3905l.subs(AbstractC18037l.class, C16690l.yandex);
        interfaceC3905l.subs(AbstractC15212l.class, C12421l.yandex);
        interfaceC3905l.subs(AbstractC16814l.class, C13864l.yandex);
        interfaceC3905l.subs(AbstractC16840l.class, C17199l.yandex);
        interfaceC3905l.subs(AbstractC8320l.class, C5328l.yandex);
        interfaceC3905l.subs(AbstractC7280l.class, C13775l.yandex);
        interfaceC3905l.subs(AbstractC0135l.class, C11845l.yandex);
        interfaceC3905l.subs(AbstractC3739l.class, C9196l.yandex);
        interfaceC3905l.subs(AbstractC2387l.class, C0197l.yandex);
        interfaceC3905l.subs(AbstractC6710l.class, C0771l.yandex);
        interfaceC3905l.subs(AbstractC0545l.class, C12583l.yandex);
        interfaceC3905l.subs(AbstractC17764l.class, C1307l.yandex);
        interfaceC3905l.subs(AbstractC11356l.class, C16599l.yandex);
        interfaceC3905l.subs(AbstractC17344l.class, C2687l.yandex);
        interfaceC3905l.subs(AbstractC9966l.class, C17412l.yandex);
        interfaceC3905l.subs(AbstractC16358l.class, C13783l.yandex);
        interfaceC3905l.subs(AbstractC5712l.class, C1884l.yandex);
        interfaceC3905l.subs(AbstractC12311l.class, C14466l.yandex);
        interfaceC3905l.subs(AbstractC12098l.class, C11422l.yandex);
        interfaceC3905l.subs(AbstractC16131l.class, C4943l.yandex);
        interfaceC3905l.subs(AbstractC14312l.class, C15265l.yandex);
        interfaceC3905l.subs(AbstractC11028l.class, C7519l.yandex);
        interfaceC3905l.subs(AbstractC15344l.class, C13753l.yandex);
        interfaceC3905l.subs(AbstractC15450l.class, C12033l.yandex);
        interfaceC3905l.subs(AbstractC7798l.class, C0758l.yandex);
        interfaceC3905l.subs(AbstractC15185l.class, C15604l.yandex);
        interfaceC3905l.subs(AbstractC14289l.class, C0171l.yandex);
        interfaceC3905l.subs(AbstractC14707l.class, C16644l.yandex);
        interfaceC3905l.subs(AbstractC14231l.class, C0200l.yandex);
        interfaceC3905l.subs(AbstractC0593l.class, C5614l.yandex);
        interfaceC3905l.subs(AbstractC13573l.class, C12696l.yandex);
        interfaceC3905l.subs(AbstractC15929l.class, C7411l.yandex);
        interfaceC3905l.subs(AbstractC9168l.class, C14200l.yandex);
        interfaceC3905l.subs(AbstractC18719l.class, C17990l.yandex);
        interfaceC3905l.subs(AbstractC8238l.class, C13804l.yandex);
        interfaceC3905l.subs(AbstractC15096l.class, C14127l.yandex);
        interfaceC3905l.subs(AbstractC9498l.class, C15943l.yandex);
        interfaceC3905l.subs(AbstractC4107l.class, C2055l.yandex);
        interfaceC3905l.subs(AbstractC5998l.class, C4561l.yandex);
        interfaceC3905l.subs(AbstractC3292l.class, C7429l.yandex);
        interfaceC3905l.subs(AbstractC10586l.class, C0088l.yandex);
        interfaceC3905l.subs(AbstractC10774l.class, C14008l.yandex);
        interfaceC3905l.subs(AbstractC11990l.class, C15223l.yandex);
        interfaceC3905l.subs(AbstractC18263l.class, C18033l.yandex);
        interfaceC3905l.subs(AbstractC3872l.class, C5236l.yandex);
        interfaceC3905l.subs(AbstractC1019l.class, C7426l.yandex);
        interfaceC3905l.subs(AbstractC4047l.class, C17392l.yandex);
        interfaceC3905l.subs(AbstractC13082l.class, C9805l.yandex);
        interfaceC3905l.subs(AbstractC7477l.class, C15775l.yandex);
        interfaceC3905l.subs(AbstractC11718l.class, C10173l.yandex);
        interfaceC3905l.subs(AbstractC4952l.class, C10697l.yandex);
        interfaceC3905l.subs(AbstractC15684l.class, C0517l.yandex);
        interfaceC3905l.subs(AbstractC13702l.class, C14210l.yandex);
        interfaceC3905l.subs(AbstractC3605l.class, C7791l.yandex);
        interfaceC3905l.subs(AbstractC17541l.class, C14134l.yandex);
        interfaceC3905l.subs(AbstractC11748l.class, C15000l.yandex);
        interfaceC3905l.subs(AbstractC15852l.class, C18669l.yandex);
        interfaceC3905l.subs(AbstractC0124l.class, C1968l.yandex);
        interfaceC3905l.subs(AbstractC18296l.class, C1271l.yandex);
        interfaceC3905l.subs(AbstractC12953l.class, C13972l.yandex);
        interfaceC3905l.subs(AbstractC9843l.class, C6409l.yandex);
        interfaceC3905l.subs(AbstractC1295l.class, C10009l.yandex);
        interfaceC3905l.subs(AbstractC17834l.class, C15415l.yandex);
        interfaceC3905l.subs(AbstractC6427l.class, C8546l.yandex);
        interfaceC3905l.subs(AbstractC3324l.class, C1892l.yandex);
        interfaceC3905l.subs(AbstractC14055l.class, C6047l.yandex);
        interfaceC3905l.subs(AbstractC9637l.class, C17571l.yandex);
        interfaceC3905l.subs(AbstractC18323l.class, C16884l.yandex);
        interfaceC3905l.subs(AbstractC0136l.class, C2305l.yandex);
        interfaceC3905l.subs(AbstractC7370l.class, C5031l.yandex);
        interfaceC3905l.subs(AbstractC6968l.class, C4889l.yandex);
        interfaceC3905l.subs(AbstractC16763l.class, C10509l.yandex);
        interfaceC3905l.subs(AbstractC16291l.class, C9150l.yandex);
        interfaceC3905l.subs(AbstractC15788l.class, C14436l.yandex);
        interfaceC3905l.subs(AbstractC2897l.class, C7510l.yandex);
        interfaceC3905l.subs(AbstractC10603l.class, C13918l.yandex);
        interfaceC3905l.subs(AbstractC11174l.class, C3137l.yandex);
        interfaceC3905l.subs(AbstractC7470l.class, C3418l.yandex);
        interfaceC3905l.subs(AbstractC5833l.class, C6978l.yandex);
        interfaceC3905l.subs(AbstractC2238l.class, C1715l.yandex);
        interfaceC3905l.subs(AbstractC3979l.class, C1376l.yandex);
        interfaceC3905l.subs(AbstractC10392l.class, C6629l.yandex);
        interfaceC3905l.subs(AbstractC0377l.class, C3336l.yandex);
        interfaceC3905l.subs(AbstractC16357l.class, C4669l.yandex);
        interfaceC3905l.subs(AbstractC2044l.class, C14453l.yandex);
        interfaceC3905l.subs(AbstractC13841l.class, C17687l.yandex);
        interfaceC3905l.subs(AbstractC18377l.class, C16155l.yandex);
        interfaceC3905l.subs(AbstractC2069l.class, C0246l.yandex);
        interfaceC3905l.subs(AbstractC0509l.class, C1877l.yandex);
        interfaceC3905l.subs(AbstractC0140l.class, C14656l.yandex);
        interfaceC3905l.subs(AbstractC5309l.class, C8794l.yandex);
        interfaceC3905l.subs(AbstractC0825l.class, C7014l.yandex);
        interfaceC3905l.subs(AbstractC7876l.class, C2547l.yandex);
        interfaceC3905l.subs(AbstractC2648l.class, C9524l.yandex);
        interfaceC3905l.subs(AbstractC16655l.class, C7428l.yandex);
        interfaceC3905l.subs(AbstractC12832l.class, C11915l.yandex);
        interfaceC3905l.subs(AbstractC3124l.class, C0158l.yandex);
        interfaceC3905l.subs(AbstractC10565l.class, C12722l.yandex);
        interfaceC3905l.subs(AbstractC0019l.class, C14128l.yandex);
        interfaceC3905l.subs(AbstractC7439l.class, C7856l.yandex);
        interfaceC3905l.subs(AbstractC2829l.class, C4963l.yandex);
        interfaceC3905l.subs(AbstractC8576l.class, C17258l.yandex);
        interfaceC3905l.subs(AbstractC16422l.class, C0475l.yandex);
        interfaceC3905l.subs(AbstractC15576l.class, C5213l.yandex);
        interfaceC3905l.subs(AbstractC3206l.class, C8146l.yandex);
        interfaceC3905l.subs(AbstractC17082l.class, C17309l.yandex);
        interfaceC3905l.subs(AbstractC16431l.class, C3638l.yandex);
        interfaceC3905l.subs(AbstractC7574l.class, C4461l.yandex);
        interfaceC3905l.subs(AbstractC11738l.class, C11385l.yandex);
        interfaceC3905l.subs(AbstractC9831l.class, C9449l.yandex);
        interfaceC3905l.subs(AbstractC14879l.class, C3593l.yandex);
        interfaceC3905l.subs(AbstractC14425l.class, C10259l.yandex);
        interfaceC3905l.subs(AbstractC15042l.class, C4905l.yandex);
        interfaceC3905l.subs(AbstractC0532l.class, C11909l.yandex);
        interfaceC3905l.subs(AbstractC17122l.class, C10404l.yandex);
        interfaceC3905l.subs(AbstractC0676l.class, C2149l.yandex);
    }

    @Override // defpackage.InterfaceC10120l
    public byte[] yandex(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.InterfaceC12954l, defpackage.InterfaceC14555l
    public /* bridge */ AbstractC15211l firebase(InterfaceC5272l interfaceC5272l) {
        return AbstractC13095l.m3531abstract(interfaceC5272l);
    }

    @Override // defpackage.InterfaceC12954l, defpackage.InterfaceC14555l
    public /* bridge */ AbstractC15211l smaato(InterfaceC5272l interfaceC5272l) {
        return AbstractC13095l.m3532case(interfaceC5272l);
    }

    @Override // defpackage.InterfaceC12954l, defpackage.InterfaceC14555l
    public /* bridge */ AbstractC15211l isPro(InterfaceC0583l interfaceC0583l) {
        return AbstractC13095l.m3549public(interfaceC0583l, true);
    }
}
