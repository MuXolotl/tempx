package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.provider.Settings;
import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: transient, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Ctransient implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f36596l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f36597l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36598l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f36599l;

    public /* synthetic */ Ctransient(C3276l c3276l, C2643l c2643l, InterfaceC7042l interfaceC7042l, C15222l c15222l) {
        this.f36598l = 12;
        this.f36597l = c3276l;
        this.f36596l = interfaceC7042l;
        this.f36599l = c15222l;
    }

    /* JADX WARN: Code duplicated, block: B:287:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0158 A[LOOP:0: B:21:0x0114->B:34:0x0158, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        long jFloatToRawIntBits;
        Object objMopub;
        int i = 28;
        int i2 = 22;
        int i3 = 11;
        float f = 1.0f;
        final int i4 = 2;
        boolean z = false;
        final int i5 = 1;
        switch (this.f36598l) {
            case 0:
                final C7659l c7659l = (C7659l) this.f36597l;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-2283931, true, new Cprotected(c7659l, (C15308l) this.f36596l, (EnumC0442l) this.f36599l, z ? 1 : 0)), 3);
                final int i6 = z ? 1 : 0;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1227731228, true, new Function3() { // from class: while
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i7 = i6;
                        C6956l c6956l = (C6956l) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i7) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c7659l.m2193import(R.string.about_contacts, 432, c6956l, false, false);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c7659l.m2193import(R.string.pref_about_3dcp_desc, 432, c6956l, false, false);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c7659l.m2193import(R.string.pref_about_header2, 432, c6956l, false, false);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                List list = c7659l.f15789l;
                c1336l.firebase(list.size(), null, new Creturn(list, 1, false), new C15578l(802480018, true, new C18025l(list, c7659l, i5)));
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-531628643, true, new Function3() { // from class: while
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i7 = i5;
                        C6956l c6956l = (C6956l) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i7) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c7659l.m2193import(R.string.about_contacts, 432, c6956l, false, false);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c7659l.m2193import(R.string.pref_about_3dcp_desc, 432, c6956l, false, false);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c7659l.m2193import(R.string.pref_about_header2, 432, c6956l, false, false);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                List list2 = c7659l.f15790l;
                c1336l.firebase(list2.size(), null, new Creturn(list2, 2, false), new C15578l(802480018, true, new C18025l(list2, c7659l, i4)));
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(2003978782, true, new Function3() { // from class: while
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i7 = i4;
                        C6956l c6956l = (C6956l) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i7) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c7659l.m2193import(R.string.about_contacts, 432, c6956l, false, false);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c7659l.m2193import(R.string.pref_about_3dcp_desc, 432, c6956l, false, false);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c7659l.m2193import(R.string.pref_about_header2, 432, c6956l, false, false);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                List list3 = c7659l.f15788l;
                c1336l.firebase(list3.size(), null, new Creturn(list3, 0, false), new C15578l(802480018, true, new C18025l(list3, c7659l, z ? 1 : 0)));
                return Unit.INSTANCE;
            case 1:
                String str = (String) this.f36597l;
                C3445l c3445l = (C3445l) this.f36596l;
                C14724l c14724l = (C14724l) this.f36599l;
                C14354l c14354l = (C14354l) obj;
                int i7 = ActionCallbackBroadcastReceiver.yandex;
                C4075l c4075lTapsense = C13285l.tapsense();
                c4075lTapsense.crashlytics();
                C13285l.vip((C13285l) c4075lTapsense.f16394l, str);
                int i8 = c3445l.yandex;
                c4075lTapsense.crashlytics();
                C13285l.metrica((C13285l) c4075lTapsense.f16394l, i8);
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(c14724l.yandex);
                ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
                for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    arrayList.add(new C8195l(((C16762l) entry.getKey()).yandex, entry.getValue()));
                }
                C8195l[] c8195lArr = (C8195l[]) arrayList.toArray(new C8195l[0]);
                Bundle bundleLoadAd = AbstractC1315l.loadAd(new C8195l("ActionCallbackBroadcastReceiver:parameters", AbstractC1315l.loadAd((C8195l[]) Arrays.copyOf(c8195lArr, c8195lArr.length))));
                Parcel parcelObtain = Parcel.obtain();
                bundleLoadAd.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                C15379l c15379lMopub = AbstractC16071l.mopub(0, bArrMarshall.length, bArrMarshall);
                c4075lTapsense.crashlytics();
                C13285l.startapp((C13285l) c4075lTapsense.f16394l, c15379lMopub);
                C13285l c13285l = (C13285l) c4075lTapsense.yandex();
                c14354l.crashlytics();
                C11208l.ads((C11208l) c14354l.f16394l, c13285l);
                return Unit.INSTANCE;
            case 2:
                C13250l c13250l = (C13250l) this.f36597l;
                C6935l c6935l = (C6935l) this.f36596l;
                C13250l c13250l2 = (C13250l) this.f36599l;
                C14734l c14734l = (C14734l) obj;
                float fFloatValue = ((Number) c14734l.purchase.getValue()).floatValue() - c13250l.f26029l;
                float fAdmob = c6935l.amazon.admob();
                c6935l.crashlytics(fAdmob + fFloatValue);
                float fAbs = Math.abs(fAdmob - c6935l.amazon.admob());
                c13250l.f26029l = ((Number) c14734l.purchase.getValue()).floatValue();
                c13250l2.f26029l = ((Number) c14734l.loadAd()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    c14734l.yandex();
                }
                return Unit.INSTANCE;
            case 3:
                C18159l c18159l = (C18159l) this.f36597l;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f36596l;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f36599l;
                if (((C0639l) interfaceC8714l.getValue()).yandex.f7563l.length() > 0) {
                    c18159l.m4498abstract(false);
                    C18159l.m4497import(interfaceC8714l, interfaceC2262l);
                }
                return Unit.INSTANCE;
            case 4:
                C0660l c0660l = (C0660l) this.f36597l;
                C18574l c18574l = (C18574l) this.f36596l;
                ContentObserver contentObserver = (ContentObserver) this.f36599l;
                Executor executor = c0660l.yandex;
                if (executor != null) {
                    try {
                        executor.execute(new RunnableC7706l(c18574l, contentObserver, c0660l, false, 1));
                    } catch (RejectedExecutionException unused) {
                        c18574l.yandex.registerContentObserver(Settings.System.getUriFor("show_password"), false, contentObserver);
                        C11239l c11239l = new C11239l(c18574l, contentObserver, i2);
                        synchronized (c0660l) {
                            if (c0660l.crashlytics) {
                                z = true;
                            } else {
                                c0660l.loadAd = c11239l;
                            }
                            Unit unit = Unit.INSTANCE;
                            if (z) {
                                c11239l.invoke();
                            }
                        }
                    }
                    break;
                } else {
                    c18574l.yandex.registerContentObserver(Settings.System.getUriFor("show_password"), false, contentObserver);
                    c0660l.loadAd = new C8652l(c18574l, contentObserver, i3);
                }
                return new C9582l(5, c0660l);
            case 5:
                AbstractC10999l.mopub((InterfaceC2262l) this.f36597l, null, 0, new C7641l((EnumC11822l) obj, (InterfaceC8714l) this.f36596l, (C15178l) this.f36599l, (InterfaceC14029l) null, 16), 3);
                return Unit.INSTANCE;
            case 6:
                String str2 = (String) this.f36597l;
                Ctry ctry = new Ctry((InterfaceC2262l) this.f36596l, (C15178l) this.f36599l, 21);
                InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                ((InterfaceC17593l) obj).amazon(AbstractC16601l.crashlytics, new C7629l(str2, ctry));
                return Unit.INSTANCE;
            case 7:
                C9991l c9991l = (C9991l) this.f36597l;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) this.f36596l;
                InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) this.f36599l;
                List list4 = (List) c9991l.f20388l.getValue();
                ((C1336l) obj).firebase(list4.size(), null, new Creturn(list4, 10, false), new C15578l(802480018, true, new C2414l(list4, c9991l, interfaceC8714l2, interfaceC8714l3, 1)));
                return Unit.INSTANCE;
            case 8:
                C11644l c11644l = (C11644l) this.f36597l;
                C3903l c3903l = (C3903l) this.f36596l;
                AbstractC9544l abstractC9544l = (AbstractC9544l) this.f36599l;
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                float fFloatValue2 = Float.valueOf(((C11063l) c11644l.f23357l).f22270l).floatValue();
                float f2 = fFloatValue2 < 0.0f ? 0.0f : fFloatValue2;
                float f3 = f2 / 2.0f;
                float f4 = f2 * 2.0f;
                float fMin = Math.min(Math.abs(c3903l.loadAd()), Math.abs(c3903l.yandex()));
                float f5 = c3903l.yandex;
                float f6 = c3903l.loadAd;
                byte b = f4 > fMin ? (byte) 1 : (byte) 0;
                long j = c3903l.purchase;
                C0404l c0404l = new C0404l(f2, 0.0f, 0, 0, null, 30);
                if (b != 0) {
                    AbstractC9361l.startapp(interfaceC13349l, abstractC9544l, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(c3903l.loadAd())) << 32) | (((long) Float.floatToRawIntBits(c3903l.yandex())) & 4294967295L), j, 0.0f, null, null, 240);
                } else if (Float.intBitsToFloat((int) (j >> 32)) < f3) {
                    float f7 = f5 + f2;
                    float f8 = f6 + f2;
                    float f9 = c3903l.crashlytics - f2;
                    float f10 = c3903l.amazon - f2;
                    C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                    long jM4551private = c18449lMo2065break.m4551private();
                    c18449lMo2065break.m4555synchronized().mopub();
                    try {
                        ((C16543l) c18449lMo2065break.f36010l).remoteconfig(f7, f8, f9, f10, 0);
                        AbstractC9361l.startapp(interfaceC13349l, abstractC9544l, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(c3903l.loadAd())) << 32) | (((long) Float.floatToRawIntBits(c3903l.yandex())) & 4294967295L), j, 0.0f, null, null, 240);
                    } finally {
                        AbstractC0653l.license(c18449lMo2065break, jM4551private);
                    }
                } else {
                    AbstractC9361l.startapp(interfaceC13349l, abstractC9544l, (((long) Float.floatToRawIntBits(f6 + f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5 + f3)) << 32), (((long) Float.floatToRawIntBits(c3903l.loadAd() - f2)) << 32) | (((long) Float.floatToRawIntBits(c3903l.yandex() - f2)) & 4294967295L), AbstractC7822l.smaato(f3, j), 0.0f, c0404l, null, 208);
                }
                return Unit.INSTANCE;
            case 9:
                C11644l c11644l2 = (C11644l) this.f36597l;
                C8896l c8896l = (C8896l) this.f36596l;
                float f11 = c8896l.loadAd;
                float f12 = c8896l.amazon;
                float f13 = c8896l.yandex;
                float f14 = c8896l.crashlytics;
                AbstractC9544l abstractC9544l2 = (AbstractC9544l) this.f36599l;
                InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj;
                float fFloatValue3 = Float.valueOf(((C11063l) c11644l2.f23357l).f22270l).floatValue();
                float f15 = fFloatValue3 < 0.0f ? 0.0f : fFloatValue3;
                byte b2 = f15 * 2.0f > Math.min(Math.abs(f14 - f13), Math.abs(f12 - f11)) ? (byte) 1 : (byte) 0;
                if (b2 != 0) {
                    jFloatToRawIntBits = c8896l.admob();
                } else {
                    float f16 = f15 / 2.0f;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f13 + f16)) << 32) | (((long) Float.floatToRawIntBits(f16 + f11)) & 4294967295L);
                }
                AbstractC9361l.vip(interfaceC13349l2, abstractC9544l2, jFloatToRawIntBits, b2 != 0 ? c8896l.mopub() : (((long) Float.floatToRawIntBits((f14 - f13) - f15)) << 32) | (((long) Float.floatToRawIntBits((f12 - f11) - f15)) & 4294967295L), 0.0f, b2 != 0 ? C5053l.yandex : new C0404l(f15, 0.0f, 0, 0, null, 30), null, 0, 104);
                return Unit.INSTANCE;
            case 10:
                C18183l c18183l = (C18183l) this.f36597l;
                HashSet hashSet = (HashSet) this.f36596l;
                InterfaceC17865l interfaceC17865l = (InterfaceC17865l) this.f36599l;
                for (String str3 : c18183l.yandex) {
                    if (!hashSet.contains(str3)) {
                        interfaceC17865l.loadAd(str3);
                    }
                }
                c18183l.yandex = hashSet;
                return new C2714l(3);
            case 11:
                InterfaceC13238l interfaceC13238l = (InterfaceC13238l) this.f36597l;
                C4456l c4456l = (C4456l) this.f36596l;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f36599l;
                C1336l c1336l2 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(2029495218, true, new C1350l(16, c4456l)), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-155947301, true, new C7442l((Object) c4456l, interfaceC12244l, 24)), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC18323l.yandex, 3);
                c1336l2.firebase(((AbstractC7095l) interfaceC13238l).pro(), null, new Creturn(interfaceC13238l, 18, false), new C15578l(802480018, true, new C3127l(interfaceC13238l, c4456l, interfaceC12244l, i5)));
                return Unit.INSTANCE;
            case 12:
                C3276l c3276l = (C3276l) this.f36597l;
                InterfaceC7042l interfaceC7042l = (InterfaceC7042l) this.f36596l;
                C15222l c15222l = (C15222l) this.f36599l;
                float fFloatValue4 = ((Float) obj).floatValue();
                f = c3276l.f7008l ? 1.0f : -1.0f;
                C4154l c4154l = c3276l.f7006l;
                long jBilling = c4154l.billing(c4154l.subs(f * fFloatValue4));
                C4154l c4154l2 = c15222l.yandex;
                float fAdmob2 = c4154l.admob(c4154l.billing(c4154l2.amazon(c4154l2.firebase, jBilling, 1))) * f;
                if (Math.abs(fAdmob2) < Math.abs(fFloatValue4)) {
                    interfaceC7042l.ads(AbstractC4952l.yandex("Scroll animation cancelled because scroll was not consumed (" + fAdmob2 + " < " + fFloatValue4 + ")", null));
                }
                return Unit.INSTANCE;
            case 13:
                C17812l c17812l = (C17812l) this.f36597l;
                C0639l c0639l = (C0639l) this.f36596l;
                InterfaceC4005l interfaceC4005l = (InterfaceC4005l) this.f36599l;
                InterfaceC13349l interfaceC13349l3 = (InterfaceC13349l) obj;
                C11224l c11224lAmazon = c17812l.amazon();
                if (c11224lAmazon != null) {
                    InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l3.mo2065break().m4555synchronized();
                    long j2 = ((C12814l) c17812l.signatures.getValue()).yandex;
                    long j3 = ((C12814l) c17812l.premium.getValue()).yandex;
                    C0327l c0327l = c11224lAmazon.yandex;
                    C4480l c4480l = c17812l.advert;
                    long j4 = c17812l.isVip;
                    if (!C12814l.amazon(j2)) {
                        c4480l.billing(j4);
                        int iAdmob = interfaceC4005l.admob(C12814l.mopub(j2));
                        int iAdmob2 = interfaceC4005l.admob(C12814l.billing(j2));
                        if (iAdmob != iAdmob2) {
                            interfaceC14859lM4555synchronized.purchase(c0327l.firebase(iAdmob, iAdmob2), c4480l);
                        }
                    } else if (!C12814l.amazon(j3)) {
                        long jCrashlytics = c0327l.yandex.loadAd.crashlytics();
                        C9735l c9735l = jCrashlytics != 16 ? new C9735l(jCrashlytics) : null;
                        long j5 = c9735l != null ? c9735l.yandex : C9735l.loadAd;
                        c4480l.billing(C9735l.loadAd(C9735l.amazon(j5) * 0.2f, j5));
                        int iAdmob3 = interfaceC4005l.admob(C12814l.mopub(j3));
                        int iAdmob4 = interfaceC4005l.admob(C12814l.billing(j3));
                        if (iAdmob3 != iAdmob4) {
                            interfaceC14859lM4555synchronized.purchase(c0327l.firebase(iAdmob3, iAdmob4), c4480l);
                        }
                    } else if (!C12814l.amazon(c0639l.loadAd)) {
                        c4480l.billing(j4);
                        long j6 = c0639l.loadAd;
                        int iAdmob5 = interfaceC4005l.admob(C12814l.mopub(j6));
                        int iAdmob6 = interfaceC4005l.admob(C12814l.billing(j6));
                        if (iAdmob5 != iAdmob6) {
                            interfaceC14859lM4555synchronized.purchase(c0327l.firebase(iAdmob5, iAdmob6), c4480l);
                        }
                    }
                    AbstractC14024l.Signature(interfaceC14859lM4555synchronized, c0327l);
                }
                return Unit.INSTANCE;
            case 14:
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f36597l;
                InterfaceC8714l interfaceC8714l4 = (InterfaceC8714l) this.f36596l;
                C13765l c13765l = (C13765l) this.f36599l;
                C1336l c1336l3 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(60036936, true, new C0828l(interfaceC2262l2, interfaceC8714l4, i5)), 3);
                if (((C4700l) interfaceC8714l4.getValue()).f9550l) {
                    AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(373253603, true, new C15394l(c13765l, i4)), 3);
                    AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(514353818, true, new C7442l(c13765l, interfaceC2262l2, i)), 3);
                }
                return Unit.INSTANCE;
            case 15:
                C13250l c13250l3 = (C13250l) this.f36597l;
                InterfaceC1555l interfaceC1555l = (InterfaceC1555l) this.f36596l;
                C13250l c13250l4 = (C13250l) this.f36599l;
                C14734l c14734l2 = (C14734l) obj;
                float fFloatValue5 = ((Number) c14734l2.purchase.getValue()).floatValue() - c13250l3.f26029l;
                float fYandex = interfaceC1555l.yandex(fFloatValue5);
                c13250l3.f26029l = ((Number) c14734l2.purchase.getValue()).floatValue();
                c13250l4.f26029l = ((Number) c14734l2.loadAd()).floatValue();
                if (Math.abs(fFloatValue5 - fYandex) > 0.5f) {
                    c14734l2.yandex();
                }
                return Unit.INSTANCE;
            case 16:
                C2863l c2863l = (C2863l) this.f36597l;
                Context context = (Context) this.f36596l;
                InterfaceC5912l interfaceC5912l = (InterfaceC5912l) this.f36599l;
                C7152l c7152l = (C7152l) obj;
                List list5 = c2863l.yandex;
                int size = list5.size();
                for (int i9 = 0; i9 < size; i9++) {
                    AbstractC1680l abstractC1680l = (AbstractC1680l) list5.get(i9);
                    if (abstractC1680l instanceof C5249l) {
                        C5249l c5249l = (C5249l) abstractC1680l;
                        C7152l.loadAd(c7152l, new C15707l(i2, c5249l), c5249l.crashlytics == 0 ? null : new C15578l(-1930700965, true, new C17208l(z ? 1 : 0, c5249l)), new C12242l(c5249l, interfaceC5912l, 13), 6);
                    } else if (abstractC1680l instanceof C8765l) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            C16278l.subs(c7152l, context, (C8765l) abstractC1680l);
                        }
                    } else if (abstractC1680l instanceof C2731l) {
                        c7152l.yandex.add(AbstractC9168l.loadAd);
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC7448l interfaceC7448l = (InterfaceC7448l) this.f36597l;
                C8427l c8427l = (C8427l) this.f36596l;
                AbstractC10113l abstractC10113l = (AbstractC10113l) this.f36599l;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                EnumC7283l enumC7283l = EnumC7283l.f15125l;
                boolean zMo992import = interfaceC7448l.mo992import();
                C15389l c15389l = c8427l.f17437l;
                float fBilling = zMo992import ? c15389l.subs().billing(((C8610l) c8427l.f17437l.mopub).getValue()) : ((C13765l) c15389l.subs).admob();
                boolean zMo992import2 = interfaceC7448l.mo992import();
                if (Float.isNaN(fBilling)) {
                    throw new C8106l(zMo992import2, c8427l.f17438l, c8427l.f17437l.subs(), ((C8610l) c8427l.f17437l.mopub).getValue());
                }
                if (AbstractC5573l.metrica(c8427l).f7691l == EnumC9931l.f20222l && c8427l.f17436l == enumC7283l) {
                    f = -1.0f;
                }
                EnumC7283l enumC7283l2 = c8427l.f17436l;
                float f17 = enumC7283l2 == enumC7283l ? f * fBilling : 0.0f;
                if (enumC7283l2 != EnumC7283l.f15126l) {
                    fBilling = 0.0f;
                }
                abstractC9601l.f19562l = true;
                abstractC9601l.mopub(abstractC10113l, AbstractC5573l.ads(f17), AbstractC5573l.ads(fBilling), 0.0f);
                Unit unit2 = Unit.INSTANCE;
                abstractC9601l.f19562l = false;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC7448l interfaceC7448l2 = (InterfaceC7448l) this.f36597l;
                C12263l c12263l = (C12263l) this.f36596l;
                AbstractC10113l abstractC10113l2 = (AbstractC10113l) this.f36599l;
                AbstractC9601l abstractC9601l2 = (AbstractC9601l) obj;
                EnumC7283l enumC7283l3 = EnumC7283l.f15125l;
                boolean zMo992import3 = interfaceC7448l2.mo992import();
                C15389l c15389l2 = c12263l.f24324l;
                float fBilling2 = zMo992import3 ? c15389l2.subs().billing(((C8610l) c12263l.f24324l.mopub).getValue()) : ((C13765l) c15389l2.subs).admob();
                if (Float.isNaN(fBilling2)) {
                    fBilling2 = 0.0f;
                }
                if (AbstractC5573l.metrica(c12263l).f7691l == EnumC9931l.f20222l && c12263l.f24323l == enumC7283l3) {
                    f = -1.0f;
                }
                EnumC7283l enumC7283l4 = c12263l.f24323l;
                float f18 = enumC7283l4 == enumC7283l3 ? f * fBilling2 : 0.0f;
                if (enumC7283l4 != EnumC7283l.f15126l) {
                    fBilling2 = 0.0f;
                }
                abstractC9601l2.f19562l = true;
                abstractC9601l2.mopub(abstractC10113l2, AbstractC5573l.ads(f18), AbstractC5573l.ads(fBilling2), 0.0f);
                Unit unit3 = Unit.INSTANCE;
                abstractC9601l2.f19562l = false;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C12469l c12469l = (C12469l) this.f36597l;
                C1141l c1141l = (C1141l) this.f36596l;
                EnumC7283l enumC7283l5 = (EnumC7283l) this.f36599l;
                long j7 = ((C3995l) obj).yandex;
                long jIsPro = c1141l.f3105l ? C1187l.isPro(-1.0f, j7) : C1187l.isPro(1.0f, j7);
                C12349l c12349l = AbstractC16318l.yandex;
                c12469l.yandex(Float.intBitsToFloat((int) (enumC7283l5 == EnumC7283l.f15126l ? jIsPro & 4294967295L : jIsPro >> 32)));
                return Unit.INSTANCE;
            case 20:
                Function0 function0 = (Function0) this.f36597l;
                Function1 function1 = (Function1) this.f36596l;
                InterfaceC8714l interfaceC8714l5 = (InterfaceC8714l) this.f36599l;
                if (((C0639l) interfaceC8714l5.getValue()).yandex.f7563l.length() > 0) {
                    function0.invoke();
                    function1.invoke(((C0639l) interfaceC8714l5.getValue()).yandex.f7563l);
                }
                return Unit.INSTANCE;
            case 21:
                final C16911l c16911l = (C16911l) this.f36597l;
                InterfaceC2262l interfaceC2262l3 = (InterfaceC2262l) this.f36596l;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) this.f36599l;
                C1336l c1336l4 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l4, null, null, AbstractC11048l.crashlytics, 3);
                AbstractC1757l.appmetrica(c1336l4, null, null, AbstractC11048l.amazon, 3);
                AbstractC1757l.appmetrica(c1336l4, null, null, AbstractC11048l.purchase, 3);
                AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(2108402632, true, new Cprotected(c16911l, interfaceC2262l3, interfaceC12244l2, 19)), 3);
                C6782l c6782l = C6782l.yandex;
                c6782l.getClass();
                C8634l c8634l = C6782l.billing;
                InterfaceC13922l interfaceC13922l = C6782l.loadAd[8];
                if (((Boolean) c8634l.pro(c6782l)).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-1902084867, true, new Function3() { // from class: lؖؑٙ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i10 = i5;
                            C13863l c13863l = C1867l.yandex;
                            C4346l c4346l = C4346l.f8873l;
                            final C16911l c16911l2 = c16911l;
                            final int i11 = 1;
                            final int i12 = 0;
                            switch (i10) {
                                case 0:
                                    C6956l c6956l = (C6956l) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                        boolean zAdmob = c6956l.admob(c16911l2);
                                        Object objM2132native = c6956l.m2132native();
                                        if (zAdmob || objM2132native == c13863l) {
                                            objM2132native = new Function0() { // from class: lًّٗ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i13 = i11;
                                                    int i14 = 3;
                                                    C16911l c16911l3 = c16911l2;
                                                    switch (i13) {
                                                        case 0:
                                                            C6782l.yandex.yandex(false);
                                                            Activity activityIsVip = c16911l3.isVip();
                                                            AbstractC11708l.yandex(new Ctry(activityIsVip, new C10734l(null, activityIsVip.getString(R.string.notification), activityIsVip.getString(R.string.restart_prompt), new C8195l(activityIsVip.getString(R.string.restart_act), new C7282l(i14)), null, 241), 4));
                                                            break;
                                                        default:
                                                            new C8948l(false, 3).Signature(c16911l3.isVip());
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            c6956l.m2147try(objM2132native);
                                        }
                                        AbstractC13319l.yandex(AbstractC11048l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, AbstractC11048l.mopub, null, null, null, c6956l, 3078, 500);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l2 = (C6956l) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                        boolean zAdmob2 = c6956l2.admob(c16911l2);
                                        Object objM2132native2 = c6956l2.m2132native();
                                        if (zAdmob2 || objM2132native2 == c13863l) {
                                            objM2132native2 = new Function0() { // from class: lًّٗ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i13 = i12;
                                                    int i14 = 3;
                                                    C16911l c16911l3 = c16911l2;
                                                    switch (i13) {
                                                        case 0:
                                                            C6782l.yandex.yandex(false);
                                                            Activity activityIsVip = c16911l3.isVip();
                                                            AbstractC11708l.yandex(new Ctry(activityIsVip, new C10734l(null, activityIsVip.getString(R.string.notification), activityIsVip.getString(R.string.restart_prompt), new C8195l(activityIsVip.getString(R.string.restart_act), new C7282l(i14)), null, 241), 4));
                                                            break;
                                                        default:
                                                            new C8948l(false, 3).Signature(c16911l3.isVip());
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            c6956l2.m2147try(objM2132native2);
                                        }
                                        AbstractC13319l.yandex(AbstractC11048l.admob, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, AbstractC11048l.subs, null, null, null, c6956l2, 3078, 500);
                                    } else {
                                        c6956l2.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                } else {
                    final int i10 = z ? 1 : 0;
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(1260976486, true, new Function3() { // from class: lؖؑٙ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i11 = i10;
                            C13863l c13863l = C1867l.yandex;
                            C4346l c4346l = C4346l.f8873l;
                            final C16911l c16911l2 = c16911l;
                            final int i12 = 1;
                            final int i13 = 0;
                            switch (i11) {
                                case 0:
                                    C6956l c6956l = (C6956l) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                        boolean zAdmob = c6956l.admob(c16911l2);
                                        Object objM2132native = c6956l.m2132native();
                                        if (zAdmob || objM2132native == c13863l) {
                                            objM2132native = new Function0() { // from class: lًّٗ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i14 = i12;
                                                    int i15 = 3;
                                                    C16911l c16911l3 = c16911l2;
                                                    switch (i14) {
                                                        case 0:
                                                            C6782l.yandex.yandex(false);
                                                            Activity activityIsVip = c16911l3.isVip();
                                                            AbstractC11708l.yandex(new Ctry(activityIsVip, new C10734l(null, activityIsVip.getString(R.string.notification), activityIsVip.getString(R.string.restart_prompt), new C8195l(activityIsVip.getString(R.string.restart_act), new C7282l(i15)), null, 241), 4));
                                                            break;
                                                        default:
                                                            new C8948l(false, 3).Signature(c16911l3.isVip());
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            c6956l.m2147try(objM2132native);
                                        }
                                        AbstractC13319l.yandex(AbstractC11048l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, AbstractC11048l.mopub, null, null, null, c6956l, 3078, 500);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l2 = (C6956l) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                        boolean zAdmob2 = c6956l2.admob(c16911l2);
                                        Object objM2132native2 = c6956l2.m2132native();
                                        if (zAdmob2 || objM2132native2 == c13863l) {
                                            objM2132native2 = new Function0() { // from class: lًّٗ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i14 = i13;
                                                    int i15 = 3;
                                                    C16911l c16911l3 = c16911l2;
                                                    switch (i14) {
                                                        case 0:
                                                            C6782l.yandex.yandex(false);
                                                            Activity activityIsVip = c16911l3.isVip();
                                                            AbstractC11708l.yandex(new Ctry(activityIsVip, new C10734l(null, activityIsVip.getString(R.string.notification), activityIsVip.getString(R.string.restart_prompt), new C8195l(activityIsVip.getString(R.string.restart_act), new C7282l(i15)), null, 241), 4));
                                                            break;
                                                        default:
                                                            new C8948l(false, 3).Signature(c16911l3.isVip());
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            c6956l2.m2147try(objM2132native2);
                                        }
                                        AbstractC13319l.yandex(AbstractC11048l.admob, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, AbstractC11048l.subs, null, null, null, c6956l2, 3078, 500);
                                    } else {
                                        c6956l2.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                }
                return Unit.INSTANCE;
            case 22:
                List list6 = (List) this.f36597l;
                C17984l c17984l = (C17984l) this.f36596l;
                C1336l c1336l5 = (C1336l) obj;
                c1336l5.firebase(list6.size(), null, new C13512l(list6, z ? 1 : 0, z), new C15578l(802480018, true, new C3127l(list6, c17984l, (InterfaceC8714l) this.f36599l, 4)));
                AbstractC1757l.appmetrica(c1336l5, null, null, new C15578l(-453416536, true, new C16568l(c17984l, z ? 1 : 0)), 3);
                return Unit.INSTANCE;
            case 23:
                C5073l c5073l = (C5073l) this.f36597l;
                C2281l c2281l = (C2281l) this.f36596l;
                C13765l c13765l2 = (C13765l) this.f36599l;
                C1336l c1336l6 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l6, null, null, new C15578l(-1682844696, true, new C3973l(c5073l, i4)), 3);
                if (((C15744l) c5073l.f11086l.getValue()).f30927l) {
                    AbstractC1757l.appmetrica(c1336l6, null, null, new C15578l(430586179, true, new C0839l(c2281l, i5)), 3);
                    AbstractC1757l.appmetrica(c1336l6, null, null, new C15578l(1776982970, true, new C0750l(i4, c5073l, c13765l2)), 3);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                Void r1 = (Void) obj;
                ((C15615l) this.f36597l).metrica((C5762l) this.f36596l, AbstractC8626l.yandex((Context) this.f36599l));
                return r1;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                InterfaceC3177l interfaceC3177l = (InterfaceC3177l) this.f36597l;
                final C15063l c15063l = (C15063l) this.f36596l;
                final Function1 function2 = (Function1) this.f36599l;
                final C10700l c10700l = new C10700l();
                InterfaceC13342l interfaceC13342l = new InterfaceC13342l() { // from class: lْٛۤ
                    @Override // defpackage.InterfaceC13342l
                    public final void ads(InterfaceC3177l interfaceC3177l2, EnumC14812l enumC14812l) {
                        int i11 = AbstractC13196l.yandex[enumC14812l.ordinal()];
                        C10700l c10700l2 = c10700l;
                        if (i11 == 1) {
                            c10700l2.f21708l = function2.invoke(c15063l);
                        } else {
                            if (i11 != 2) {
                                return;
                            }
                            C4466l c4466l = (C4466l) c10700l2.f21708l;
                            if (c4466l != null) {
                                c4466l.yandex();
                            }
                            c10700l2.f21708l = null;
                        }
                    }
                };
                interfaceC3177l.loadAd().yandex(interfaceC13342l);
                return new C15386l(interfaceC3177l, interfaceC13342l, c10700l, i5);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C10685l c10685l = (C10685l) this.f36597l;
                AbstractC18643l abstractC18643l = (AbstractC18643l) this.f36596l;
                InterfaceC0582l interfaceC0582l = (InterfaceC0582l) this.f36599l;
                XTrackLyrics xTrackLyrics = new XTrackLyrics();
                c10685l.getClass();
                xTrackLyrics.purchase(C10685l.m2944catch(abstractC18643l));
                C13047l c13047l = (C13047l) c10685l.f21690l;
                c13047l.getClass();
                xTrackLyrics.crashlytics(c13047l.crashlytics(InterfaceC0582l.Companion.serializer(), interfaceC0582l));
                return (XTrackLyrics) ((C3918l) obj).m1450l(xTrackLyrics);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Set set = (Set) this.f36597l;
                C11265l c11265l = (C11265l) this.f36596l;
                C10700l c10700l2 = (C10700l) this.f36599l;
                if (set.contains(obj) && (objMopub = c11265l.loadAd.mopub(obj)) != null) {
                    if (objMopub instanceof C6295l) {
                        C6295l c6295l = (C6295l) objMopub;
                        Object[] objArr = c6295l.loadAd;
                        long[] jArr = c6295l.yandex;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j8 = jArr[i11];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        if ((255 & j8) < 128) {
                                            InterfaceC0389l interfaceC0389l = (InterfaceC0389l) objArr[(i11 << 3) + i13];
                                            if (c10700l2.f21708l == null) {
                                                c10700l2.f21708l = new ArrayList();
                                            }
                                            ((List) c10700l2.f21708l).add(interfaceC0389l);
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i12 == 8) {
                                        if (i11 != length) {
                                            i11++;
                                        }
                                    }
                                } else if (i11 != length) {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        InterfaceC0389l interfaceC0389l2 = (InterfaceC0389l) objMopub;
                        if (c10700l2.f21708l == null) {
                            c10700l2.f21708l = new ArrayList();
                        }
                        ((List) c10700l2.f21708l).add(interfaceC0389l2);
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C18554l c18554l = (C18554l) this.f36597l;
                InterfaceC2262l interfaceC2262l4 = (InterfaceC2262l) this.f36596l;
                C17408l c17408l = (C17408l) this.f36599l;
                C1336l c1336l7 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l7, null, null, AbstractC8317l.yandex, 3);
                AbstractC1757l.appmetrica(c1336l7, null, null, new C15578l(100038192, true, new C3572l(c18554l, interfaceC2262l4, c17408l, i5)), 3);
                AbstractC1757l.appmetrica(c1336l7, null, null, AbstractC8317l.amazon, 3);
                c1336l7.firebase(EnumC0972l.f2683l.pro(), null, new C2911l(9), new C15578l(802480018, true, new C6780l(c17408l, c18554l)));
                return Unit.INSTANCE;
            default:
                InterfaceC2262l interfaceC2262l5 = (InterfaceC2262l) this.f36597l;
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) this.f36596l;
                C9197l c9197l = (C9197l) this.f36599l;
                C1336l c1336l8 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l8, null, null, new C15578l(-1175158798, true, new C0541l(interfaceC2262l5, interfaceC12244l3, 17)), 3);
                if (((C3278l) interfaceC12244l3.getValue()).f7019l) {
                    AbstractC1757l.appmetrica(c1336l8, null, null, AbstractC11141l.amazon, 3);
                    AbstractC1757l.appmetrica(c1336l8, null, null, new C15578l(469753824, true, new C17356l(c9197l, i5)), 3);
                    List list7 = ((C3278l) interfaceC12244l3.getValue()).f7017l;
                    c1336l8.firebase(list7.size(), null, new C13512l(list7, i3, z), new C15578l(802480018, true, new C2414l(list7, interfaceC2262l5, interfaceC12244l3, c9197l, 5)));
                } else {
                    AbstractC1757l.appmetrica(c1336l8, null, null, new C15578l(-1984304946, true, new C17356l(c9197l, i4)), 3);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Ctransient(C13250l c13250l, InterfaceC1555l interfaceC1555l, C13250l c13250l2, C1192l c1192l) {
        this.f36598l = 15;
        this.f36597l = c13250l;
        this.f36596l = interfaceC1555l;
        this.f36599l = c13250l2;
    }

    public /* synthetic */ Ctransient(Object obj, Object obj2, Object obj3, int i) {
        this.f36598l = i;
        this.f36597l = obj;
        this.f36596l = obj2;
        this.f36599l = obj3;
    }
}
