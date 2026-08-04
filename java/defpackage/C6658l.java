package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.playback.widget_glance.player_small.SmallPlayerGlanceConfigurationActivity;

/* JADX INFO: renamed from: lؙۖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6658l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f13995l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f13996l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13997l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f13998l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f13999l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f14000l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6658l(InterfaceC17817l interfaceC17817l, C12759l c12759l, int i, C8195l c8195l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f13998l = 4;
        this.f13996l = interfaceC17817l;
        this.f13999l = c12759l;
        this.f13995l = i;
        this.f13997l = c8195l;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0364  */
    /* JADX WARN: Code duplicated, block: B:168:0x036b A[LOOP:3: B:167:0x0369->B:168:0x036b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x0391  */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v19, types: [lۣٜ٘] */
    /* JADX WARN: Type inference failed for: r1v24, types: [lۣٜ٘] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r2v16, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Iterator it;
        int i;
        C3422l c3422l;
        C15237l c15237l;
        float fAdmob;
        int size;
        int i2;
        InterfaceC1601l interfaceC1601l;
        int i3;
        C18306l c18306l;
        int iIndexOf;
        Object objBilling;
        C11362l c11362l;
        C3445l c3445l;
        C10532l c10532l;
        C17584l c17584lM2196instanceof;
        C7679l c7679l;
        int i4 = this.f13998l;
        ?? r1 = 3;
        int i5 = 0;
         = 0;
        ?? r2 = 0;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj2 = this.f13997l;
        ?? r9 = 0;
        switch (i4) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f13999l;
                C7119l c7119l = (C7119l) obj2;
                int i6 = this.f14000l;
                try {
                    if (i6 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        InterfaceC6942l[] interfaceC6942lArr = (InterfaceC6942l[]) this.f13996l;
                        int i7 = this.f13995l;
                        InterfaceC6942l interfaceC6942l = interfaceC6942lArr[i7];
                        C18203l c18203l = new C18203l(c7119l, i7);
                        this.f14000l = 1;
                        if (interfaceC6942l.yandex(c18203l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i6 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        c7119l.crashlytics(null);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        c7119l.crashlytics(null);
                    }
                    throw th;
                }
            case 1:
                int i8 = this.f13995l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C3422l c3422l2 = (C3422l) obj2;
                    it = c3422l2.f7277l.iterator();
                    i = 0;
                    c3422l = c3422l2;
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.f14000l;
                    it = (Iterator) this.f13999l;
                    c3422l = (C3422l) this.f13996l;
                    AbstractC2829l.crashlytics(obj);
                }
                while (it.hasNext()) {
                    Function2 function2 = (Function2) it.next();
                    C13991l c13991l = c3422l.f7278l;
                    this.f13996l = c3422l;
                    this.f13999l = it;
                    this.f14000l = i;
                    this.f13995l = 1;
                    if (function2.invoke(c13991l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj2;
                C5866l c5866l = (C5866l) this.f13996l;
                int i9 = this.f13995l;
                int i10 = this.f14000l;
                if (i10 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) this.f13999l;
                    int i11 = AbstractC8007l.yandex;
                    if (!((Boolean) interfaceC8714l2.getValue()).booleanValue() && i9 >= 0) {
                        Iterator it2 = c5866l.admob().firebase.iterator();
                        int i12 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i12 = -1;
                            } else if (((C15237l) it2.next()).yandex != i9) {
                                i12++;
                            }
                        }
                        boolean z = i12 != -1;
                        int i13 = i12 > 0 ? ((C15237l) c5866l.admob().firebase.get(i12 - 1)).startapp / 2 : 0;
                        if (!((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                            this.f14000l = 3;
                            if (C5866l.isPro(c5866l, i9, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            int i14 = AbstractC8007l.yandex;
                            interfaceC8714l.setValue(Boolean.TRUE);
                            Unit unit = Unit.INSTANCE;
                        } else if (z) {
                            C1644l c1644lAdmob = c5866l.admob();
                            C15387l c15387l = c5866l.purchase;
                            if (c1644lAdmob.firebase.isEmpty()) {
                                fAdmob = 0.0f;
                            } else {
                                List list = c1644lAdmob.firebase;
                                int size2 = list.size();
                                for (int i15 = 0; i15 < size2; i15++) {
                                    Object obj3 = list.get(i15);
                                    if (((C15237l) obj3).yandex == i9) {
                                        r9 = obj3;
                                        c15237l = (C15237l) r9;
                                        if (c15237l == null) {
                                            size = list.size();
                                            i2 = 0;
                                            for (int i16 = 0; i16 < size; i16++) {
                                                i2 += ((C15237l) list.get(i16)).startapp;
                                            }
                                            fAdmob = ((i9 - c15387l.loadAd.admob()) * ((i2 / list.size()) + c1644lAdmob.adcel)) - c15387l.crashlytics.admob();
                                        } else {
                                            fAdmob = c15237l.metrica;
                                        }
                                    }
                                }
                                c15237l = (C15237l) r9;
                                if (c15237l == null) {
                                    size = list.size();
                                    i2 = 0;
                                    while (i16 < size) {
                                        i2 += ((C15237l) list.get(i16)).startapp;
                                    }
                                    fAdmob = ((i9 - c15387l.loadAd.admob()) * ((i2 / list.size()) + c1644lAdmob.adcel)) - c15387l.crashlytics.admob();
                                } else {
                                    fAdmob = c15237l.metrica;
                                }
                            }
                            float f = fAdmob - i13;
                            C4776l c4776lFirebase = AbstractC8007l.firebase();
                            this.f14000l = 1;
                            if (AbstractC16817l.mopub(c5866l, f, c4776lFirebase, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        } else {
                            this.f14000l = 2;
                            if (c5866l.billing(i9, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                } else if (i10 == 1) {
                    AbstractC2829l.crashlytics(obj);
                } else if (i10 == 2) {
                    AbstractC2829l.crashlytics(obj);
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    if (i10 != 3) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    int i17 = AbstractC8007l.yandex;
                    interfaceC8714l.setValue(Boolean.TRUE);
                    Unit unit4 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 3:
                int i18 = this.f13995l;
                try {
                    if (i18 != 0) {
                        if (i18 == 1) {
                            int i19 = this.f14000l;
                            C18306l c18306l2 = (C18306l) this.f13999l;
                            InterfaceC1601l interfaceC1601l2 = (InterfaceC1601l) this.f13996l;
                            AbstractC2829l.crashlytics(obj);
                            c18306l = c18306l2;
                            i3 = i19;
                            interfaceC1601l = interfaceC1601l2;
                        } else {
                            if (i18 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            C18306l c18306l3 = (C18306l) this.f13999l;
                            InterfaceC1601l interfaceC1601l3 = (InterfaceC1601l) this.f13996l;
                            AbstractC2829l.crashlytics(obj);
                            r1 = c18306l3;
                            r2 = interfaceC1601l3;
                        }
                        r1 = c18306l;
                        r2 = interfaceC1601l;
                        r1.f35802l.setValue(C7489l.yandex);
                        r2 = r2;
                        Unit unit5 = Unit.INSTANCE;
                        return Unit.INSTANCE;
                    }
                    AbstractC2829l.crashlytics(obj);
                    C18306l c18306l4 = (C18306l) obj2;
                    C4910l c4910l = c18306l4.f35800l;
                    this.f13996l = c4910l;
                    this.f13999l = c18306l4;
                    this.f14000l = 0;
                    this.f13995l = 1;
                    if (c4910l.yandex(this) == enumC9342l) {
                        return enumC9342l;
                    }
                    interfaceC1601l = c4910l;
                    i3 = 0;
                    c18306l = c18306l4;
                    r2 = interfaceC1601l;
                    if (AbstractC8576l.yandex((InterfaceC0718l) c18306l.f35802l.getValue(), C7489l.loadAd)) {
                        c18306l.f35802l.setValue(C7489l.crashlytics);
                        this.f13996l = interfaceC1601l;
                        this.f13999l = c18306l;
                        this.f14000l = i3;
                        this.f13995l = 2;
                        if (C18306l.m4508l(c18306l, this) == enumC9342l) {
                            r1 = c18306l;
                            r2 = interfaceC1601l;
                            return enumC9342l;
                        }
                        r1 = c18306l;
                        r2 = interfaceC1601l;
                        r1.f35802l.setValue(C7489l.yandex);
                        r2 = r2;
                    }
                    break;
                } catch (Exception e) {
                    r1.f35802l.setValue(new C18461l(e));
                    r2 = r2;
                } finally {
                    r2.billing(null);
                }
                Unit unit6 = Unit.INSTANCE;
                return Unit.INSTANCE;
            case 4:
                int i20 = this.f14000l;
                if (i20 != 0) {
                    if (i20 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i20 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                InterfaceC17817l interfaceC17817l = (InterfaceC17817l) this.f13996l;
                C12759l c12759l = (C12759l) this.f13999l;
                int i21 = this.f13995l;
                AbstractC18643l abstractC18643l = (AbstractC18643l) c12759l.yandex.get(((C0767l) ((C8195l) obj2).f17098l).loadAd.yandex);
                this.f14000l = 1;
                if (c16076l.metrica(interfaceC17817l, c12759l, i21, abstractC18643l, this) == enumC9342l) {
                    return enumC9342l;
                }
                C16076l c16076l2 = VKXApplication.f36632l;
                C16076l c16076l3 = c16076l2 != null ? c16076l2 : null;
                this.f14000l = 2;
                if (c16076l3.startapp(this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 5:
                C6388l c6388l = (C6388l) obj2;
                C1253l c1253l = (C1253l) this.f13999l;
                C11362l c11362l2 = c1253l.f3283l;
                C11362l c11362l3 = c1253l.f3280l;
                C11362l c11362l4 = c1253l.f3281l;
                int i22 = this.f13995l;
                if (i22 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    String str = c6388l.crashlytics;
                    String str2 = c6388l.crashlytics;
                    if (AbstractC16901l.inmobi(c11362l4, str)) {
                        AbstractC9464l.yandex(c11362l4).remove(str2);
                    } else {
                        if (str2 == null) {
                            return Unit.INSTANCE;
                        }
                        c11362l4.add(str2);
                    }
                    if (!AbstractC16901l.inmobi(c11362l3, str2)) {
                        iIndexOf = c11362l2.indexOf(c6388l) + 1;
                        C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                        if (str2 == null) {
                            return Unit.INSTANCE;
                        }
                        this.f13996l = c11362l2;
                        this.f14000l = iIndexOf;
                        this.f13995l = 1;
                        C17464l c17464l = new C17464l("audio.getRelatedArtistsById", C1083l.f2984l);
                        c17464l.yandex("artist_id", str2);
                        c17464l.loadAd(0, "offset");
                        c17464l.loadAd(10, "count");
                        objBilling = c7644lLoadAd.billing(c17464l, this);
                        if (objBilling == enumC9342l) {
                            return enumC9342l;
                        }
                        c11362l = c11362l2;
                    }
                    c1253l.f3279l = null;
                    return Unit.INSTANCE;
                }
                if (i22 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i23 = this.f14000l;
                C11362l c11362l5 = (C11362l) this.f13996l;
                AbstractC2829l.crashlytics(obj);
                c11362l = c11362l5;
                iIndexOf = i23;
                objBilling = obj;
                C1273l c1273l = (C1273l) AbstractC10802l.isPro((AbstractC14237l) objBilling);
                List list2 = c1273l != null ? c1273l.yandex : null;
                if (list2 == null) {
                    list2 = C2580l.f5619l;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list2) {
                    if (!c11362l2.contains((C6388l) obj4)) {
                        arrayList.add(obj4);
                    }
                }
                c11362l.addAll(iIndexOf, AbstractC16901l.m4247try(arrayList, 3));
                c11362l3.add(c6388l.crashlytics);
                c1253l.f3279l = null;
                return Unit.INSTANCE;
            case 6:
                SmallPlayerGlanceConfigurationActivity smallPlayerGlanceConfigurationActivity = (SmallPlayerGlanceConfigurationActivity) obj2;
                int i24 = this.f14000l;
                if (i24 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C12183l c12183l = new C12183l(smallPlayerGlanceConfigurationActivity);
                    int i25 = this.f13995l;
                    if (c12183l.loadAd.getAppWidgetInfo(i25) == null) {
                        C8339l.metrica("Invalid AppWidget ID.");
                        return null;
                    }
                    c3445l = new C3445l(i25);
                    C15656l c15656l = C15656l.crashlytics;
                    C7864l c7864l = new C7864l(smallPlayerGlanceConfigurationActivity, r9, 18);
                    this.f13996l = smallPlayerGlanceConfigurationActivity;
                    this.f13999l = c3445l;
                    this.f14000l = 1;
                    if (AbstractC2438l.subs(smallPlayerGlanceConfigurationActivity, c15656l, c3445l, c7864l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                    c10532l = new C10532l();
                    this.f13996l = null;
                    this.f13999l = null;
                    this.f14000l = 2;
                    if (c10532l.admob(smallPlayerGlanceConfigurationActivity, c3445l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else if (i24 == 1) {
                    c3445l = (C3445l) this.f13999l;
                    smallPlayerGlanceConfigurationActivity = (SmallPlayerGlanceConfigurationActivity) this.f13996l;
                    AbstractC2829l.crashlytics(obj);
                    c10532l = new C10532l();
                    this.f13996l = null;
                    this.f13999l = null;
                    this.f14000l = 2;
                    if (c10532l.admob(smallPlayerGlanceConfigurationActivity, c3445l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i24 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                C7679l c7679l2 = (C7679l) obj2;
                int i26 = this.f13995l;
                if (i26 != 0) {
                    if (i26 == 1) {
                        i5 = this.f14000l;
                        c17584lM2196instanceof = (C17584l) this.f13999l;
                        c7679l2 = (C7679l) this.f13996l;
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i26 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c17584lM2196instanceof = (C17584l) this.f13999l;
                        c7679l = (C7679l) this.f13996l;
                        AbstractC2829l.crashlytics(obj);
                    }
                    Boolean bool = (Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue();
                    bool.getClass();
                    c7679l.f16103l.setValue(bool);
                    c7679l.f16104l.setValue(c17584lM2196instanceof);
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                AbstractC18082l abstractC18082l = C7679l.f16101l;
                c17584lM2196instanceof = c7679l2.m2196instanceof();
                c7679l2.f16104l.setValue(null);
                C6760l c6760l = C9658l.f19699l;
                long jTapsense = AbstractC15918l.tapsense(2, EnumC16636l.SECONDS);
                this.f13996l = c7679l2;
                this.f13999l = c17584lM2196instanceof;
                this.f14000l = 0;
                this.f13995l = 1;
                if (AbstractC8532l.billing(jTapsense, this) == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC16584l.yandex().yandex();
                C5374l c5374lYandex = AbstractC16584l.yandex();
                this.f13996l = c7679l2;
                this.f13999l = c17584lM2196instanceof;
                this.f14000l = i5;
                this.f13995l = 2;
                if (c5374lYandex.loadAd(this) == enumC9342l) {
                    return enumC9342l;
                }
                c7679l = c7679l2;
                Boolean bool2 = (Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue();
                bool2.getClass();
                c7679l.f16103l.setValue(bool2);
                c7679l.f16104l.setValue(c17584lM2196instanceof);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f13998l;
        Object obj2 = this.f13997l;
        switch (i) {
            case 0:
                return new C6658l((InterfaceC6942l[]) this.f13996l, this.f13995l, (AtomicInteger) this.f13999l, (C7119l) obj2, interfaceC14029l);
            case 1:
                return new C6658l((C3422l) obj2, interfaceC14029l, 1);
            case 2:
                return new C6658l(this.f13995l, (C5866l) this.f13996l, (InterfaceC8714l) this.f13999l, (InterfaceC8714l) obj2, interfaceC14029l);
            case 3:
                return new C6658l((C18306l) obj2, interfaceC14029l, 3);
            case 4:
                return new C6658l((InterfaceC17817l) this.f13996l, (C12759l) this.f13999l, this.f13995l, (C8195l) obj2, interfaceC14029l);
            case 5:
                return new C6658l((C1253l) this.f13999l, (C6388l) obj2, interfaceC14029l);
            case 6:
                return new C6658l((SmallPlayerGlanceConfigurationActivity) obj2, this.f13995l, interfaceC14029l);
            default:
                return new C6658l((C7679l) obj2, interfaceC14029l, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f13998l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((C6658l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6658l(int i, C5866l c5866l, InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f13998l = 2;
        this.f13995l = i;
        this.f13996l = c5866l;
        this.f13999l = interfaceC8714l;
        this.f13997l = interfaceC8714l2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6658l(C1253l c1253l, C6388l c6388l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f13998l = 5;
        this.f13999l = c1253l;
        this.f13997l = c6388l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6658l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f13998l = i;
        this.f13997l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6658l(SmallPlayerGlanceConfigurationActivity smallPlayerGlanceConfigurationActivity, int i, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f13998l = 6;
        this.f13997l = smallPlayerGlanceConfigurationActivity;
        this.f13995l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6658l(InterfaceC6942l[] interfaceC6942lArr, int i, AtomicInteger atomicInteger, C7119l c7119l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f13998l = 0;
        this.f13996l = interfaceC6942lArr;
        this.f13995l = i;
        this.f13999l = atomicInteger;
        this.f13997l = c7119l;
    }
}
