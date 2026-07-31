package defpackage;

import android.content.ClipDescription;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lًؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0783l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f2363l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2364l;

    public /* synthetic */ C0783l(C0783l c0783l, C3151l c3151l) {
        this.f2364l = 7;
        this.f2363l = c0783l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2667l c2667lCrashlytics;
        int i = this.f2364l;
        int i2 = 8;
        final int i3 = 2;
        final int i4 = 4;
        int i5 = 24;
        final int i6 = 3;
        boolean z = false;
        z = false;
        boolean z2 = false;
        final int i7 = 1;
        Object obj2 = this.f2363l;
        switch (i) {
            case 0:
                C13888l c13888l = (C13888l) obj2;
                C1336l c1336l = (C1336l) obj;
                C10086l c10086l = c13888l.f27160l;
                if (((AbstractC7095l) ((InterfaceC13238l) c10086l.getValue())).isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, AbstractC17653l.crashlytics, 3);
                }
                InterfaceC13238l interfaceC13238l = (InterfaceC13238l) c10086l.getValue();
                c1336l.firebase(((AbstractC7095l) interfaceC13238l).pro(), null, new C5640l(interfaceC13238l, i5, z), new C15578l(802480018, true, new C11074l(interfaceC13238l, c13888l, i3)));
                return Unit.INSTANCE;
            case 1:
                C7650l c7650l = (C7650l) obj2;
                C1336l c1336l2 = (C1336l) obj;
                C10086l c10086l2 = c7650l.f15745l;
                if (((AbstractC18082l) c10086l2.getValue()).isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC1315l.crashlytics, 3);
                } else {
                    AbstractC18082l abstractC18082l = (AbstractC18082l) c10086l2.getValue();
                    c1336l2.firebase(abstractC18082l.pro(), null, new C2214l(abstractC18082l, 3), new C15578l(802480018, true, new C11074l(abstractC18082l, c7650l, i6)));
                    if (((Boolean) c7650l.f15746l.getValue()).booleanValue()) {
                        AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-1524105466, true, new C4855l(c7650l, i7)), 3);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C7679l c7679l = (C7679l) obj2;
                C14543l c14543l = (C14543l) obj;
                AbstractC1757l.inmobi(c14543l, new C15578l(-426862035, true, new C17738l(c7679l, z ? 1 : 0)));
                AbstractC18082l abstractC18082l2 = C7679l.f16101l;
                c14543l.crashlytics.isPro(abstractC18082l2.pro(), new C8609l(null, new C1178l(0, abstractC18082l2), null, new C15578l(-334987442, true, new C11074l(abstractC18082l2, c7679l, i4))));
                AbstractC1757l.inmobi(c14543l, AbstractC17457l.billing);
                AbstractC1757l.inmobi(c14543l, new C15578l(-1602702667, true, new C17738l(c7679l, i6)));
                return Unit.INSTANCE;
            case 3:
                C8934l c8934l = (C8934l) obj;
                return ((CharSequence) obj2).subSequence(c8934l.f15488l, c8934l.f15487l + 1).toString();
            case 4:
                C6148l c6148l = (C6148l) obj;
                C0580l c0580lM532l = C0432l.m532l((C0432l) obj2, 4);
                c6148l.crashlytics(c0580lM532l.license((byte) 21) ? c0580lM532l.f2017synchronized : 1.0f);
                c6148l.remoteconfig(c0580lM532l.license((byte) 22) ? c0580lM532l.f2014strictfp : 1.0f);
                c6148l.vip(c0580lM532l.license((byte) 23) ? c0580lM532l.f2020volatile : 1.0f);
                c6148l.Signature(c0580lM532l.license((byte) 24) ? c0580lM532l.f2009native : 0.0f);
                c6148l.pro(c0580lM532l.license((byte) 25) ? c0580lM532l.f2012private : 0.0f);
                c6148l.subs(c0580lM532l.license((byte) 26) ? c0580lM532l.f2004extends : 0.0f);
                c6148l.isPro(c0580lM532l.license((byte) 27) ? c0580lM532l.f2006for : 0.0f);
                c6148l.smaato(c0580lM532l.license((byte) 28) ? c0580lM532l.f2018throw : 0.0f);
                c6148l.billing(c0580lM532l.pro(54) ? c0580lM532l.f2001continue : null);
                long jYandex = C1723l.loadAd;
                if (c0580lM532l.license((byte) 29) || c0580lM532l.license((byte) 30)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jYandex >> 32));
                    if (c0580lM532l.license((byte) 29)) {
                        fIntBitsToFloat = c0580lM532l.f1999catch;
                    }
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jYandex));
                    if (c0580lM532l.license((byte) 30)) {
                        fIntBitsToFloat2 = c0580lM532l.f2003else;
                    }
                    jYandex = AbstractC5518l.yandex(fIntBitsToFloat, fIntBitsToFloat2);
                }
                c6148l.tapsense(jYandex);
                c6148l.purchase(c0580lM532l.license((byte) 31) ? c0580lM532l.appmetrica : false);
                InterfaceC6347l interfaceC6347l = AbstractC16837l.yandex;
                if (c0580lM532l.pro(53)) {
                    interfaceC6347l = c0580lM532l.inmobi;
                }
                c6148l.startapp(interfaceC6347l);
                return Unit.INSTANCE;
            case 5:
                Drawable drawable = (Drawable) obj2;
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l.mo2065break().m4555synchronized();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)), (int) Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())));
                Canvas canvas = AbstractC10071l.yandex;
                drawable.draw(((C2151l) interfaceC14859lM4555synchronized).yandex);
                return Unit.INSTANCE;
            case 6:
                ((Function1) obj).invoke((C18624l) obj2);
                return Unit.INSTANCE;
            case 7:
                C0783l c0783l = (C0783l) obj2;
                InterfaceC11189l interfaceC11189l = (InterfaceC11189l) obj;
                if (interfaceC11189l instanceof C6244l) {
                    c0783l.invoke(((C6244l) interfaceC11189l).f13184l);
                    return Boolean.TRUE;
                }
                C8339l.smaato("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 8:
                C10304l c10304l = (C10304l) obj2;
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) obj;
                C8896l c8896l = (C8896l) c10304l.f20994l.advert.getValue();
                if (c8896l == null) {
                    c8896l = C8896l.purchase;
                }
                InterfaceC18212l interfaceC18212lPurchase = c10304l.f20998l.purchase();
                if (interfaceC18212lPurchase != null) {
                    return AbstractC17332l.amazon(c8896l, interfaceC18212lPurchase, interfaceC18212l);
                }
                AbstractC14825l.amazon("Required value was null.");
                C17132l.firebase();
                return null;
            case 9:
                ClipDescription clipDescription = ((C1323l) obj).yandex.getClipDescription();
                Iterable<C15774l> iterable = (Iterable) ((C9495l) obj2).invoke();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (C15774l c15774l : iterable) {
                        if (AbstractC8576l.yandex(c15774l, C15774l.crashlytics) || (clipDescription != null && clipDescription.hasMimeType(c15774l.yandex))) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 10:
                C15271l c15271l = (C15271l) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                C13765l c13765l = c15271l.yandex;
                float fAdmob = c13765l.admob() + fFloatValue;
                C13765l c13765l2 = c15271l.loadAd;
                if (fAdmob > c13765l2.admob()) {
                    fFloatValue = c13765l2.admob() - c13765l.admob();
                } else if (fAdmob < 0.0f) {
                    fFloatValue = -c13765l.admob();
                }
                c13765l.subs(c13765l.admob() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 11:
                C11244l c11244l = (C11244l) obj2;
                C15012l c15012l = (C15012l) obj;
                InterfaceC18302l interfaceC18302l = (InterfaceC18302l) c15012l.yandex;
                if (interfaceC18302l instanceof C14754l) {
                    C14754l c14754l = (C14754l) interfaceC18302l;
                    if (c14754l.loadAd == null) {
                        return C15012l.yandex(c15012l, new C14754l(c14754l.yandex, c11244l, c14754l.crashlytics), 0, 0, 14);
                    }
                }
                if (!(interfaceC18302l instanceof C7409l)) {
                    return c15012l;
                }
                C7409l c7409l = (C7409l) interfaceC18302l;
                return c7409l.loadAd == null ? C15012l.yandex(c15012l, new C7409l(c7409l.yandex, c11244l, c7409l.crashlytics), 0, 0, 14) : c15012l;
            case 12:
                ((C8715l) obj2).isPro = null;
                return Unit.INSTANCE;
            case 13:
                C3641l c3641l = (C3641l) obj2;
                C14416l c14416l = (C14416l) obj;
                c14416l.yandex(c3641l.yandex.purchase(), "first");
                c14416l.yandex(c3641l.loadAd.purchase(), "second");
                c14416l.yandex(c3641l.crashlytics.purchase(), "third");
                return Unit.INSTANCE;
            case 14:
                ((C13550l) obj2).billing.subscription((String) obj);
                return Unit.INSTANCE;
            case 15:
                ((C18480l) ((C8585l) obj2).amazon.f11764l).purchase(new C10972l(new C2221l(((Integer) obj).intValue(), 16), new C8163l(i2)));
                return Unit.INSTANCE;
            case 16:
                C6473l c6473l = (C6473l) obj2;
                List list = (List) c6473l.f13518l.getValue();
                ((C1336l) obj).firebase(list.size(), null, new C1178l(9, list), new C15578l(802480018, true, new C11074l(list, c6473l, 7)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C12842l c12842l = (C12842l) obj2;
                List list2 = (List) c12842l.f25250l.getValue();
                ((C1336l) obj).firebase(list2.size(), null, new C1178l(10, list2), new C15578l(802480018, true, new C11074l(list2, c12842l, i2)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C7931l c7931l = (C7931l) obj;
                C4723l c4723l = ((C15252l) obj2).yandex;
                synchronized (c4723l.crashlytics) {
                    if (c4723l.amazon) {
                        throw new IllegalStateException("Check failed.");
                    }
                    StringBuilder sb = new StringBuilder("CameraGraph-");
                    C11879l c11879l = C14437l.loadAd;
                    c11879l.getClass();
                    sb.append(C11879l.loadAd.incrementAndGet(c11879l));
                    c2667lCrashlytics = c4723l.crashlytics(c7931l, new C14437l(sb.toString()));
                }
                return c2667lCrashlytics;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                final C5310l c5310l = (C5310l) obj2;
                C1336l c1336l3 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(-911803962, true, new Function3() { // from class: lُؖۜ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i8 = i7;
                        C5310l c5310l2 = c5310l;
                        C6956l c6956l = (C6956l) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i8) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Блокировать прочие треки", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Специальная иконка", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Автор иконки: https://vk.com/sayfex\nАвтор идеи: https://vk.com/nyakolan\n\nВернуть нормальную иконку можно в Настройках > Внешний вид.", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Фильтрация каталогов", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Блокировать треки с кириллицей...", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, C10053l.billing, 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(-90816626, true, new Function3() { // from class: lُؖۜ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i8 = i3;
                        C5310l c5310l2 = c5310l;
                        C6956l c6956l = (C6956l) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i8) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Блокировать прочие треки", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Специальная иконка", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Автор иконки: https://vk.com/sayfex\nАвтор идеи: https://vk.com/nyakolan\n\nВернуть нормальную иконку можно в Настройках > Внешний вид.", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Фильтрация каталогов", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Блокировать треки с кириллицей...", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(780004973, true, new Function3() { // from class: lُؖۜ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i8 = i6;
                        C5310l c5310l2 = c5310l;
                        C6956l c6956l = (C6956l) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i8) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Блокировать прочие треки", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Специальная иконка", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Автор иконки: https://vk.com/sayfex\nАвтор идеи: https://vk.com/nyakolan\n\nВернуть нормальную иконку можно в Настройках > Внешний вид.", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Фильтрация каталогов", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Блокировать треки с кириллицей...", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, C10053l.mopub, 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(-1773319125, true, new Function3() { // from class: lُؖۜ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i8 = i4;
                        C5310l c5310l2 = c5310l;
                        C6956l c6956l = (C6956l) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i8) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Блокировать прочие треки", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Специальная иконка", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Автор иконки: https://vk.com/sayfex\nАвтор идеи: https://vk.com/nyakolan\n\nВернуть нормальную иконку можно в Настройках > Внешний вид.", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Фильтрация каталогов", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Блокировать треки с кириллицей...", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, C10053l.admob, 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, C10053l.subs, 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, C10053l.isPro, 3);
                final int i8 = z ? 1 : 0;
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(1709967271, true, new Function3() { // from class: lُؖۜ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i9 = i8;
                        C5310l c5310l2 = c5310l;
                        C6956l c6956l = (C6956l) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i9) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Блокировать прочие треки", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Специальная иконка", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Автор иконки: https://vk.com/sayfex\nАвтор идеи: https://vk.com/nyakolan\n\nВернуть нормальную иконку можно в Настройках > Внешний вид.", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Фильтрация каталогов", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5310l2.m1757import("Блокировать треки с кириллицей...", c6956l, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, C10053l.firebase, 3);
                return Unit.INSTANCE;
            case 20:
                ((C1008l) obj2).remoteconfig(null, obj);
                return Unit.INSTANCE;
            case 21:
                ((C4708l) obj).loadAd = (C11610l) obj2;
                return Unit.INSTANCE;
            case 22:
                ((C7947l) ((C7644l) obj2).f15738l).getClass();
                C8688l c8688l = C10328l.purchase;
                ((C0422l) obj).yandex = AbstractC10409l.crashlytics().amazon.ads();
                return Unit.INSTANCE;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((C10086l) obj2).setValue(bool);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                final C5364l c5364l = (C5364l) obj2;
                C1336l c1336l4 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l4, null, null, C5883l.crashlytics, 3);
                final int i9 = z ? 1 : 0;
                AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-357048947, true, new Function3() { // from class: lْٙؑ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i10 = i9;
                        C13863l c13863l = C1867l.yandex;
                        C4346l c4346l = C4346l.f8873l;
                        switch (i10) {
                            case 0:
                                C6956l c6956l = (C6956l) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C5364l c5364l2 = c5364l;
                                    boolean z3 = ((String) c5364l2.f11500l.getValue()).length() == 0;
                                    boolean zAdmob = c6956l.admob(c5364l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C6814l c6814l = new C6814l(0, c5364l2, C5364l.class, "signIntoVkm", "signIntoVkm()V", 0, 0, 28);
                                        c6956l.m2147try(c6814l);
                                        objM2132native = c6814l;
                                    }
                                    AbstractC13319l.yandex(AbstractC14566l.amazon(928292075, new C6161l(c5364l2, 1, (byte) 0), c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon, z3, null, (Function0) ((InterfaceC5059l) objM2132native), 14), null, AbstractC14566l.amazon(-235311314, new C6161l(c5364l2, 2, (byte) 0), c6956l), null, null, null, c6956l, 3078, 500);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l2 = (C6956l) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C5364l c5364l3 = c5364l;
                                    boolean zAdmob2 = c6956l2.admob(c5364l3);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        C6814l c6814l2 = new C6814l(0, c5364l3, C5364l.class, "resetVkm", "resetVkm()V", 0, 0, 29);
                                        c6956l2.m2147try(c6814l2);
                                        objM2132native2 = c6814l2;
                                    }
                                    AbstractC13319l.yandex(C5883l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) ((InterfaceC5059l) objM2132native2), 15), null, C5883l.purchase, null, null, null, c6956l2, 3078, 500);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                if (((String) c5364l.f11500l.getValue()).length() > 0) {
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-2089962319, true, new Function3() { // from class: lْٙؑ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i10 = i7;
                            C13863l c13863l = C1867l.yandex;
                            C4346l c4346l = C4346l.f8873l;
                            switch (i10) {
                                case 0:
                                    C6956l c6956l = (C6956l) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                        C5364l c5364l2 = c5364l;
                                        boolean z3 = ((String) c5364l2.f11500l.getValue()).length() == 0;
                                        boolean zAdmob = c6956l.admob(c5364l2);
                                        Object objM2132native = c6956l.m2132native();
                                        if (zAdmob || objM2132native == c13863l) {
                                            C6814l c6814l = new C6814l(0, c5364l2, C5364l.class, "signIntoVkm", "signIntoVkm()V", 0, 0, 28);
                                            c6956l.m2147try(c6814l);
                                            objM2132native = c6814l;
                                        }
                                        AbstractC13319l.yandex(AbstractC14566l.amazon(928292075, new C6161l(c5364l2, 1, (byte) 0), c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon, z3, null, (Function0) ((InterfaceC5059l) objM2132native), 14), null, AbstractC14566l.amazon(-235311314, new C6161l(c5364l2, 2, (byte) 0), c6956l), null, null, null, c6956l, 3078, 500);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l2 = (C6956l) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                        C5364l c5364l3 = c5364l;
                                        boolean zAdmob2 = c6956l2.admob(c5364l3);
                                        Object objM2132native2 = c6956l2.m2132native();
                                        if (zAdmob2 || objM2132native2 == c13863l) {
                                            C6814l c6814l2 = new C6814l(0, c5364l3, C5364l.class, "resetVkm", "resetVkm()V", 0, 0, 29);
                                            c6956l2.m2147try(c6814l2);
                                            objM2132native2 = c6814l2;
                                        }
                                        AbstractC13319l.yandex(C5883l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) ((InterfaceC5059l) objM2132native2), 15), null, C5883l.purchase, null, null, null, c6956l2, 3078, 500);
                                    } else {
                                        c6956l2.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                }
                AbstractC1757l.appmetrica(c1336l4, null, null, C5883l.billing, 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C13470l) obj2).amazon = null;
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C13470l) obj2).amazon = null;
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C16076l) ((C15035l) obj2).loadAd.get()).f31521l.isPro((String) obj);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C3918l c3918l = (C3918l) obj;
                c3918l.m1451l(c3918l.m1449l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{AbstractC16676l.mopub((AudioTrack) obj2)}, 1)).crashlytics());
                return Boolean.TRUE;
            default:
                C3095l c3095l = (C3095l) obj2;
                long jLongValue = ((Long) obj).longValue();
                AbstractC6873l.crashlytics(c3095l.amazon, new C8578l(i5));
                AbstractC10999l.mopub(c3095l.loadAd, null, 0, new C17400l(jLongValue, c3095l, (InterfaceC14029l) null, 7), 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0783l(int i, Object obj) {
        this.f2364l = i;
        this.f2363l = obj;
    }
}
