package defpackage;

import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٔۖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15079l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f29608l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29609l;

    public /* synthetic */ C15079l(InterfaceC3442l interfaceC3442l, C18595l c18595l) {
        this.f29609l = 19;
        this.f29608l = interfaceC3442l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strConcat;
        int length;
        int i;
        String str;
        int i2 = this.f29609l;
        int i3 = 0;
        Object obj2 = this.f29608l;
        switch (i2) {
            case 0:
                return (C7695l) ((C12986l) obj2).invoke(((C16229l) obj).yandex);
            case 1:
                List list = (List) ((C12986l) obj2).invoke((C7695l) obj);
                if (list != null) {
                    return new C16229l(list);
                }
                return null;
            case 2:
                ((C18480l) obj2).purchase(new C10529l(obj));
                return Unit.INSTANCE;
            case 3:
                ((C6148l) obj).crashlytics(((C9879l) obj2).vip.admob());
                return Unit.INSTANCE;
            case 4:
                ArrayList arrayList = (ArrayList) ((C10038l) obj2).f20466l;
                ((C1336l) obj).firebase(arrayList.size(), null, new Creturn(arrayList, 19, false), new C15578l(802480018, true, new C7340l(2, arrayList)));
                return Unit.INSTANCE;
            case 5:
                AppActivity appActivity = (AppActivity) obj2;
                if (((Boolean) obj).booleanValue()) {
                    appActivity.license(new C5310l(0));
                }
                return Unit.INSTANCE;
            case 6:
                C5807l c5807l = (C5807l) obj2;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    c5807l.loadAd(null);
                } else if (th instanceof CancellationException) {
                    c5807l.crashlytics();
                } else {
                    c5807l.amazon(th);
                }
                return Unit.INSTANCE;
            case 7:
                C0360l c0360l = (C0360l) obj2;
                C8688l c8688l = c0360l.isPro;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    c0360l.admob.m2959public(new C15647l(th2));
                }
                if (c8688l.yandex()) {
                    ((InterfaceC5137l) c8688l.getValue()).close();
                }
                return Unit.INSTANCE;
            case 8:
                CachedTrack cachedTrack = (CachedTrack) obj2;
                cachedTrack.m4625catch(true);
                return (CachedTrack) ((C3918l) obj).m1450l(cachedTrack);
            case 9:
                ((Boolean) obj).getClass();
                ((C3464l) obj2).billing();
                return Unit.INSTANCE;
            case 10:
                ((Boolean) obj).getClass();
                ((C17873l) obj2).billing();
                return Unit.INSTANCE;
            case 11:
                float fFloatValue = ((Float) obj).floatValue();
                C6935l c6935lYandex = ((C10809l) obj2).smaato.yandex();
                c6935lYandex.crashlytics(c6935lYandex.amazon.admob() + fFloatValue);
                return Unit.INSTANCE;
            case 12:
                ((C0462l) obj2).m561l();
                return Unit.INSTANCE;
            case 13:
                float fFloatValue2 = ((Float) obj).floatValue();
                C6935l c6935lYandex2 = ((C15351l) obj2).ads.yandex();
                c6935lYandex2.crashlytics(c6935lYandex2.amazon.admob() + fFloatValue2);
                return Unit.INSTANCE;
            case 14:
                ((Boolean) obj).getClass();
                C10086l c10086l = ((C1026l) obj2).f2856l;
                c10086l.setValue(Boolean.valueOf(!((Boolean) c10086l.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 15:
                ((C5613l) obj2).f11929l = true;
                return Unit.INSTANCE;
            case 16:
                InterfaceC0421l interfaceC0421l = (InterfaceC0421l) obj;
                return Boolean.valueOf(interfaceC0421l instanceof InterfaceC5960l ? ((Boolean) ((C5724l) obj2).invoke(interfaceC0421l)).booleanValue() : true);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C10111l) obj2).f20586l = null;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C14787l c14787l = (C14787l) obj2;
                ArrayList arrayList2 = c14787l.f28912l;
                ((C1336l) obj).firebase(arrayList2.size(), null, new Creturn(arrayList2, 25, false), new C15578l(2039820996, true, new C6780l(arrayList2, c14787l, 8)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC3442l interfaceC3442l = (InterfaceC3442l) obj;
                String str2 = ((InterfaceC3442l) obj2) == interfaceC3442l ? " > " : "   ";
                if (!(interfaceC3442l instanceof C0597l)) {
                    if (interfaceC3442l instanceof C6163l) {
                        C6163l c6163l = (C6163l) interfaceC3442l;
                        length = c6163l.yandex.f7563l.length();
                        i = c6163l.loadAd;
                        str = "SetComposingTextCommand(text.length=";
                    } else if (interfaceC3442l instanceof C11645l) {
                        strConcat = ((C11645l) interfaceC3442l).toString();
                    } else if (interfaceC3442l instanceof C12066l) {
                        strConcat = ((C12066l) interfaceC3442l).toString();
                    } else if (interfaceC3442l instanceof C16953l) {
                        strConcat = ((C16953l) interfaceC3442l).toString();
                    } else if (interfaceC3442l instanceof C3363l) {
                        strConcat = ((C3363l) interfaceC3442l).toString();
                    } else if (interfaceC3442l instanceof C2680l) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (interfaceC3442l instanceof C16536l) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strLicense = AbstractC18202l.yandex.loadAd(interfaceC3442l.getClass()).license();
                        if (strLicense == null) {
                            strLicense = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strLicense);
                    }
                    return str2.concat(strConcat);
                }
                C0597l c0597l = (C0597l) interfaceC3442l;
                length = c0597l.yandex.f7563l.length();
                i = c0597l.loadAd;
                str = "CommitTextCommand(text.length=";
                strConcat = AbstractC12589l.applovin(length, i, str, ", newCursorPosition=", ")");
                return str2.concat(strConcat);
            case 20:
                AbstractC3984l.pro(((C4481l) obj).crashlytics, (InterfaceC10011l[]) obj2);
                return Unit.INSTANCE;
            case 21:
                AbstractC1757l.appmetrica((C1336l) obj, null, null, new C15578l(147926824, true, new C7254l((C3492l) obj2, i3)), 3);
                return Unit.INSTANCE;
            case 22:
                C0311l c0311l = (C0311l) obj2;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC0509l.loadAd, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-2129976339, true, new C1350l(23, c0311l)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC0509l.amazon, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC0509l.purchase, 3);
                ArrayList arrayList3 = c0311l.f1357l;
                c1336l.firebase(arrayList3.size(), null, new Creturn(arrayList3, 28, false), new C15578l(802480018, true, new C6780l(arrayList3, c0311l, 9)));
                return Unit.INSTANCE;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((C7246l) obj2).f15079l.setValue(bool);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", (C16916l) obj);
                return new C6539l(((C11835l) obj2).f23669l.yandex(null), null, null);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C17893l c17893l = (C17893l) obj2;
                Object[] objArr = c17893l.f34848l;
                int i4 = c17893l.f34846l;
                while (i3 < i4) {
                    ((InterfaceC17792l) objArr[i3]).crashlytics();
                    i3++;
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C16627l c16627l = (C16627l) obj;
                return ((C7620l) obj2).yandex(new C16627l(null, c16627l.loadAd, c16627l.crashlytics, c16627l.amazon, c16627l.purchase)).getValue();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return C3259l.loadAd((C3259l) obj, ((EnumC11447l) obj2) == EnumC11447l.f23031l, null, null, null, null, 125);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C4595l c4595l = (C4595l) obj2;
                C16221l c16221l = (C16221l) obj;
                Map mapYandex = c16221l.yandex();
                LinkedHashMap linkedHashMap = c16221l.yandex;
                long j = 0;
                for (Map.Entry entry : mapYandex.entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        C16033l c16033l = (C16033l) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strAmazon = c4595l.amazon(System.currentTimeMillis());
                        if (set.contains(strAmazon)) {
                            Object[] objArr2 = {strAmazon};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr2[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                C8339l.metrica(AbstractC15560l.subscription(obj3, "duplicate element: "));
                                return null;
                            }
                            c16221l.amazon(c16033l, DesugarCollections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            c16221l.loadAd();
                            linkedHashMap.remove(c16033l);
                        }
                    }
                }
                C16033l c16033l2 = C4595l.crashlytics;
                if (j == 0) {
                    c16221l.loadAd();
                    linkedHashMap.remove(c16033l2);
                } else {
                    c16221l.amazon(c16033l2, Long.valueOf(j));
                }
                return null;
            default:
                return C3259l.loadAd((C3259l) obj, false, null, null, null, (EnumC3503l) obj2, 95);
        }
    }

    public /* synthetic */ C15079l(int i, Object obj) {
        this.f29609l = i;
        this.f29608l = obj;
    }
}
