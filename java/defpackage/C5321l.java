package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import j$.util.function.Function$CC;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.function.Function;

/* JADX INFO: renamed from: lؗۨٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5321l implements InterfaceC14795l, InterfaceC10162l, InterfaceC11545l, InterfaceC14623l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f11449l;

    public C5321l(C12676l c12676l, byte[][] bArr) {
        if (c12676l == null) {
            C6541l.subs("params == null");
            throw null;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                C6541l.subs("publicKey byte array == null");
                throw null;
            }
        }
        if (bArr.length != c12676l.amazon) {
            C8339l.metrica("wrong publicKey size");
            throw null;
        }
        for (byte[] bArr3 : bArr) {
            if (bArr3.length != c12676l.loadAd) {
                C8339l.metrica("wrong publicKey format");
                throw null;
            }
        }
        this.f11449l = AbstractC4047l.amazon(bArr);
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C18414l c18414l = (C18414l) ((C8900l) obj).metrica();
        BinderC15695l binderC15695l = new BinderC15695l((C1539l) this.f11449l, (C2350l) obj2);
        Parcel parcelM743l = c18414l.m743l();
        AbstractC15425l.crashlytics(parcelM743l, binderC15695l);
        c18414l.m741l(parcelM743l, 27);
    }

    @Override // defpackage.InterfaceC14623l
    public void admob(AbstractC11229l abstractC11229l) {
        C0189l c0189l = (C0189l) abstractC11229l;
        C13698l c13698l = new C13698l(2, 29);
        C3557l c3557l = (C3557l) this.f11449l;
        c13698l.f26746l = Boolean.valueOf(((BinderC11031l) c3557l.f7479l).mopub == 2);
        c3557l.mopub(new C6276l(c13698l));
        C6643l c6643l = (C6643l) c3557l.f7482l;
        AbstractC1051l.subs(c6643l);
        c6643l.yandex(c0189l);
        c0189l.smaato = (C7214l) c3557l.f7481l;
    }

    public void amazon(AbstractC1096l abstractC1096l) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f11449l;
        if (!abstractC1096l.remoteconfig()) {
            if (!(abstractC1096l instanceof C2485l)) {
                C8339l.metrica("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC1096l.getClass())));
                return;
            }
            C2485l c2485l = (C2485l) abstractC1096l;
            amazon(c2485l.f5287l);
            amazon(c2485l.f5286l);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(C2485l.f5283l, abstractC1096l.admob());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iApplovin = C2485l.applovin(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((AbstractC1096l) arrayDeque.peek()).admob() >= iApplovin) {
            arrayDeque.push(abstractC1096l);
            return;
        }
        int iApplovin2 = C2485l.applovin(iBinarySearch);
        AbstractC1096l c2485l2 = (AbstractC1096l) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((AbstractC1096l) arrayDeque.peek()).admob() < iApplovin2) {
            c2485l2 = new C2485l((AbstractC1096l) arrayDeque.pop(), c2485l2);
        }
        C2485l c2485l3 = new C2485l(c2485l2, abstractC1096l);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(C2485l.f5283l, c2485l3.f5284l);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC1096l) arrayDeque.peek()).admob() >= C2485l.applovin(iBinarySearch2 + 1)) {
                break;
            } else {
                c2485l3 = new C2485l((AbstractC1096l) arrayDeque.pop(), c2485l3);
            }
        }
        arrayDeque.push(c2485l3);
    }

    @Override // defpackage.InterfaceC14623l
    public void billing(AbstractC11229l abstractC11229l, int i) {
        C13698l c13698l = new C13698l(5, 29);
        c13698l.f26743l = Integer.valueOf(i);
        C6276l c6276l = new C6276l(c13698l);
        C3557l c3557l = (C3557l) this.f11449l;
        c3557l.mopub(c6276l);
        c3557l.smaato();
    }

    @Override // defpackage.InterfaceC14795l
    public void crashlytics(C10602l c10602l) {
        ((InterfaceC11821l) this.f11449l).crashlytics(c10602l);
    }

    @Override // defpackage.InterfaceC14623l
    public void firebase(AbstractC11229l abstractC11229l, String str) {
        C6276l c6276l = new C6276l(new C13698l(4, 29));
        C3557l c3557l = (C3557l) this.f11449l;
        c3557l.mopub(c6276l);
        C6643l c6643l = (C6643l) c3557l.f7482l;
        AbstractC1051l.subs(c6643l);
        c6643l.yandex((C0189l) abstractC11229l);
        C6643l c6643l2 = (C6643l) c3557l.f7482l;
        AbstractC1051l.subs(c6643l2);
        String str2 = c6643l2.firebase;
        if (str2 == null) {
            c6643l2.firebase = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            c6643l2.loadAd(4);
        }
    }

    @Override // defpackage.InterfaceC14623l
    public void isPro(AbstractC11229l abstractC11229l, int i) {
        C13698l c13698l = new C13698l(6, 29);
        c13698l.f26743l = Integer.valueOf(i);
        C6276l c6276l = new C6276l(c13698l);
        C3557l c3557l = (C3557l) this.f11449l;
        c3557l.mopub(c6276l);
        C6643l c6643l = (C6643l) c3557l.f7482l;
        AbstractC1051l.subs(c6643l);
        c6643l.yandex((C0189l) abstractC11229l);
    }

    public long loadAd(long j) {
        C8043l c8043l = (C8043l) this.f11449l;
        c8043l.getClass();
        if (C12121l.loadAd(j) <= 0.0f || C12121l.crashlytics(j) <= 0.0f) {
            AbstractC0081l.crashlytics("maximumVelocity should be a positive value. You specified=".concat(C12121l.mopub(j)));
        }
        return AbstractC12311l.mopub(((C13507l) c8043l.f16742l).crashlytics(C12121l.loadAd(j)), ((C13507l) c8043l.f16741l).crashlytics(C12121l.crashlytics(j)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC10162l
    public void metrica(C3823l c3823l) {
        C12100l c12100l;
        BinderC2728l binderC2728l = (BinderC2728l) this.f11449l;
        C0022l c0022l = BinderC2728l.remoteconfig;
        boolean z = binderC2728l.isPro;
        char c = 0;
        if (c3823l.smaato()) {
            Bundle bundle = (Bundle) c3823l.isPro();
            boolean z2 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            c0022l.loadAd("The module-to-client output switcher flag %s", true != z2 ? "not existed" : "existed");
            if (z2) {
                binderC2728l.firebase = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            }
        }
        boolean z3 = binderC2728l.firebase;
        if (binderC2728l.billing == null || (c12100l = binderC2728l.mopub) == null) {
            return;
        }
        boolean z4 = c12100l.f24045l;
        boolean z5 = c12100l.f24038l;
        boolean z6 = z3 && c12100l.f24030l;
        C14379l c14379l = new C14379l();
        int i = Build.VERSION.SDK_INT;
        c14379l.yandex = i >= 30;
        if (i >= 30) {
            c14379l.yandex = z6;
        }
        if (i >= 30) {
            c14379l.crashlytics = z4;
        }
        if (i >= 30) {
            c14379l.loadAd = z5;
        }
        boolean z7 = c12100l.f24047l;
        if (i >= 30) {
            c14379l.amazon = z7;
        }
        C9868l c9868l = new C9868l(c14379l);
        C9961l.loadAd();
        C17646l c17646lCrashlytics = C9961l.crashlytics();
        C9868l c9868l2 = c17646lCrashlytics.Signature;
        HandlerC3504l handlerC3504l = c17646lCrashlytics.yandex;
        c17646lCrashlytics.Signature = c9868l;
        boolean zAdmob = c17646lCrashlytics.admob();
        C3288l c3288l = c17646lCrashlytics.ads;
        if (zAdmob) {
            if (c3288l == null) {
                C3288l c3288l2 = new C3288l(c17646lCrashlytics.mopub, new C7026l(9, c17646lCrashlytics));
                c17646lCrashlytics.ads = c3288l2;
                c17646lCrashlytics.yandex(c3288l2, true);
                c17646lCrashlytics.smaato();
            }
            C3288l c3288l3 = c17646lCrashlytics.ads;
            boolean z8 = c9868l.amazon;
            c3288l3.f7026l = z8;
            c3288l3.isPro();
            C8961l c8961l = c17646lCrashlytics.crashlytics;
            c8961l.yandex = z8;
            ((Handler) c8961l.purchase).post((RunnableC5360l) c8961l.subs);
            if (((c9868l2 == null || !c9868l2.crashlytics) ? c : (char) 1) != c9868l.crashlytics) {
                C3288l c3288l4 = c17646lCrashlytics.ads;
                c3288l4.f7558l = c17646lCrashlytics.signatures;
                if (!c3288l4.f7560l) {
                    c3288l4.f7560l = true;
                    c3288l4.f7553l.sendEmptyMessage(2);
                }
            }
        } else {
            c = 0;
            if (c3288l != null) {
                C12545l c12545lAmazon = c17646lCrashlytics.amazon(c3288l);
                if (c12545lAmazon != null) {
                    C9961l.loadAd();
                    c3288l.f7559l = null;
                    c3288l.mopub(null);
                    c17646lCrashlytics.vip(c12545lAmazon, null);
                    handlerC3504l.loadAd(514, c12545lAmazon);
                    c17646lCrashlytics.smaato.remove(c12545lAmazon);
                }
                c17646lCrashlytics.ads = null;
                C8961l c8961l2 = c17646lCrashlytics.crashlytics;
                ((Handler) c8961l2.purchase).post((RunnableC5360l) c8961l2.subs);
            }
        }
        handlerC3504l.loadAd(769, c9868l);
        Boolean boolValueOf = Boolean.valueOf(z);
        Boolean boolValueOf2 = Boolean.valueOf(z6);
        Boolean boolValueOf3 = Boolean.valueOf(z4);
        Boolean boolValueOf4 = Boolean.valueOf(z5);
        Object[] objArr = new Object[4];
        objArr[c] = boolValueOf;
        objArr[1] = boolValueOf2;
        objArr[2] = boolValueOf3;
        objArr[3] = boolValueOf4;
        Log.i(c0022l.yandex, c0022l.amazon("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", objArr));
        C8181l c8181l = binderC2728l.subs;
        if (c8181l != null) {
            c8181l.purchase = (z && z6) ? 1 : c;
        }
        if (z && z6) {
            C17987l.yandex(EnumC10345l.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        if (z4) {
            C17987l.yandex(EnumC10345l.CAST_TRANSFER_TO_LOCAL_ENABLED);
        }
    }

    public C15635l purchase(final C7447l c7447l, final C13648l c13648l) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f11449l;
        int i = 28;
        if (Build.VERSION.SDK_INT < 24) {
            C10316l c10316l = new C10316l(c7447l, c13648l);
            C15635l c15635l = new C15635l(c10316l);
            C15635l c15635l2 = (C15635l) concurrentHashMap.putIfAbsent(c10316l.crashlytics, c15635l);
            if (c15635l2 != null) {
                return c15635l2;
            }
            C14563l.yandex(c7447l.loadAd, new C7026l(i, this));
            return c15635l;
        }
        final C14706l c14706l = new C14706l(10);
        c14706l.f28767l = false;
        Context context = c7447l.loadAd;
        String str = c13648l.amazon;
        if (str == null) {
            str = (String) c13648l.yandex.apply(context);
            c13648l.amazon = str;
        }
        C15635l c15635l3 = (C15635l) ConcurrentMap$EL.computeIfAbsent(concurrentHashMap, str, new Function() { // from class: lٍؚؕ
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                C15635l c15635l4 = new C15635l(new C10316l(c7447l, c13648l));
                c14706l.f28767l = true;
                return c15635l4;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (c14706l.f28767l) {
            C14563l.yandex(c7447l.loadAd, new C7026l(i, this));
        }
        return c15635l3;
    }

    @Override // defpackage.InterfaceC14623l
    public /* bridge */ /* synthetic */ void remoteconfig(AbstractC11229l abstractC11229l) {
    }

    @Override // defpackage.InterfaceC14623l
    public void smaato(AbstractC11229l abstractC11229l, int i) {
        C13698l c13698l = new C13698l(8, 29);
        c13698l.f26743l = Integer.valueOf(i);
        C6276l c6276l = new C6276l(c13698l);
        C3557l c3557l = (C3557l) this.f11449l;
        c3557l.mopub(c6276l);
        c3557l.smaato();
    }

    @Override // defpackage.InterfaceC14623l
    public /* synthetic */ void startapp(AbstractC11229l abstractC11229l, boolean z) {
        C6276l c6276l = new C6276l(new C13698l(4, 29));
        C3557l c3557l = (C3557l) this.f11449l;
        c3557l.mopub(c6276l);
        C6643l c6643l = (C6643l) c3557l.f7482l;
        AbstractC1051l.subs(c6643l);
        c6643l.yandex((C0189l) abstractC11229l);
    }

    @Override // defpackage.InterfaceC14623l
    public void vip(AbstractC11229l abstractC11229l, int i) {
        C13698l c13698l = new C13698l(9, 29);
        c13698l.f26743l = Integer.valueOf(i);
        C3557l c3557l = (C3557l) this.f11449l;
        c13698l.f26746l = Boolean.valueOf(((BinderC11031l) c3557l.f7479l).mopub == 2);
        c3557l.mopub(new C6276l(c13698l));
        c3557l.smaato();
    }

    @Override // defpackage.InterfaceC14623l
    public void yandex(AbstractC11229l abstractC11229l, String str) {
        C6276l c6276l = new C6276l(new C13698l(7, 29));
        C3557l c3557l = (C3557l) this.f11449l;
        c3557l.mopub(c6276l);
        C6643l c6643l = (C6643l) c3557l.f7482l;
        AbstractC1051l.subs(c6643l);
        c6643l.yandex((C0189l) abstractC11229l);
        C6643l c6643l2 = (C6643l) c3557l.f7482l;
        AbstractC1051l.subs(c6643l2);
        String str2 = c6643l2.firebase;
        if (str2 == null) {
            c6643l2.firebase = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            c6643l2.loadAd(4);
        }
    }

    public /* synthetic */ C5321l(Object obj) {
        this.f11449l = obj;
    }

    public C5321l(int i) {
        switch (i) {
            case 4:
                this.f11449l = new ArrayDeque();
                break;
            case 5:
            default:
                this.f11449l = new C8043l();
                break;
            case 6:
                this.f11449l = new ConcurrentHashMap();
                break;
        }
    }
}
