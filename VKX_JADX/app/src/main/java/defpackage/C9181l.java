package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌۥۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9181l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f18889l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f18890l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f18891l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f18892l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9181l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18891l = i;
        this.f18889l = obj;
        this.f18890l = obj2;
    }

    private final Object pro(Object obj) {
        AbstractC18643l abstractC18643l;
        C9879l c9879l = (C9879l) this.f18890l;
        C1320l c1320l = (C1320l) this.f18889l;
        int i = this.f18892l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            List list = c1320l.yandex;
            C10507l c10507lIsPro = c9879l.isPro();
            C10086l c10086l = c9879l.isPro;
            int iIndexOf = list.indexOf(c10507lIsPro);
            int i2 = iIndexOf < 0 ? 0 : iIndexOf;
            C6678l c6678l = (C6678l) c10086l.getValue();
            AbstractC18082l abstractC18082lBilling = AbstractC0509l.billing(c1320l.yandex);
            c6678l.getClass();
            c10086l.setValue(new C6678l(abstractC18082lBilling, i2));
            c9879l.metrica(C14267l.yandex(c9879l.firebase(), null, i2, null, null, null, false, false, false, false, false, null, false, false, 0, 0, 32765));
            C7119l c7119l = c9879l.smaato;
            Unit unit = Unit.INSTANCE;
            this.f18889l = null;
            this.f18892l = 1;
            Object objLoadAd = c7119l.loadAd(this, unit);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        c16076l.getClass();
        int i3 = 12;
        C10507l c10507l = (C10507l) c16076l.admob(new C18606l(c16076l, i3));
        AbstractC18643l abstractC18643l2 = c10507l != null ? c10507l.loadAd : null;
        C16076l c16076l2 = VKXApplication.f36632l;
        if (c16076l2 == null) {
            c16076l2 = null;
        }
        C10507l c10507lCrashlytics = c16076l2.crashlytics();
        if (c10507lCrashlytics == null || (abstractC18643l = c10507lCrashlytics.loadAd) == null) {
            return Unit.INSTANCE;
        }
        C16076l c16076l3 = VKXApplication.f36632l;
        if (c16076l3 == null) {
            c16076l3 = null;
        }
        c16076l3.getClass();
        C10507l c10507l2 = (C10507l) c16076l3.admob(new C18606l(c16076l3, 5));
        ArrayList arrayListM2420volatile = AbstractC8669l.m2420volatile(new AbstractC18643l[]{abstractC18643l2, abstractC18643l, c10507l2 != null ? c10507l2.loadAd : null});
        C16076l c16076l4 = VKXApplication.f36632l;
        C16076l c16076l5 = c16076l4 != null ? c16076l4 : null;
        c16076l5.getClass();
        c9879l.admob.setValue(new C3981l(((C10507l) c16076l5.admob(new C18606l(c16076l5, i3))) != null ? 1 : 0, arrayListM2420volatile));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r1v140 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C2434l c2434l;
        Object next;
        Object objCrashlytics;
        ?? r1;
        Object c18435l;
        Object c18435l2;
        Object c18435l3;
        Object c18435l4;
        Object c18435l5;
        Object c18435l6;
        Object c18435l7;
        Object c18435l8;
        Object c18435l9;
        Object c18435l10;
        Object c18435l11;
        Object c18435l12;
        Object objAdmob;
        Object c18435l13;
        int i = this.f18891l;
        int i2 = 6;
        int i3 = 28;
        EnumC16636l enumC16636l = EnumC16636l.SECONDS;
        int i4 = 2;
        Object obj2 = this.f18890l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                String str = (String) obj2;
                ?? r2 = this.f18892l;
                try {
                    if (r2 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        VKXApplication.Companion companion = VKXApplication.f36628l;
                        C11610l c11610l = AbstractC3629l.yandex;
                        if (c11610l == null) {
                            c11610l = null;
                        }
                        C11644l c11644l = new C11644l(28);
                        c11644l.m3157l(str);
                        C18389l c18389lBilling = c11610l.yandex(new C17032l(c11644l)).billing();
                        InputStream inputStreamMo713l = c18389lBilling.f35907l.mo1516l().mo713l();
                        EnumC6690l enumC6690l = EnumC6690l.f14038l;
                        C2434l c2434lMo1235l = ((AbstractC17054l) new C5501l(inputStreamMo713l).f11764l).mo1235l();
                        if (c2434lMo1235l.yandex()) {
                            Iterator it = c2434lMo1235l.yandex.yandex.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    int i5 = ((C4246l) next).loadAd.yandex;
                                    do {
                                        Object next2 = it.next();
                                        int i6 = ((C4246l) next2).loadAd.yandex;
                                        if (i5 < i6) {
                                            next = next2;
                                            i5 = i6;
                                        }
                                    } while (it.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            String strConcat = ((C4246l) next).yandex;
                            if (!AbstractC16648l.isVip(strConcat, "http", false)) {
                                strConcat = str.substring(0, AbstractC12024l.m3343switch(str, '/', 0, 6) + 1).concat(strConcat);
                            }
                            C13170l c13170l = new C13170l();
                            c13170l.isPro(null, strConcat);
                            String str2 = c13170l.crashlytics().subs;
                            this.f18889l = c18389lBilling;
                            this.f18892l = 1;
                            objCrashlytics = C0121l.crashlytics(str2, this);
                            r2 = c18389lBilling;
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        } else {
                            c2434l = c2434lMo1235l;
                            r1 = c18389lBilling;
                        }
                        AbstractC7876l.loadAd(r1, null);
                        return c2434l;
                    }
                    if (r2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    C18389l c18389l = (C18389l) this.f18889l;
                    AbstractC2829l.crashlytics(obj);
                    objCrashlytics = obj;
                    r2 = c18389l;
                    c2434l = (C2434l) objCrashlytics;
                    r1 = r2;
                    AbstractC7876l.loadAd(r1, null);
                    return c2434l;
                } catch (Throwable th) {
                    ?? r3 = r2;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC7876l.loadAd(r3, th);
                        throw th2;
                    }
                }
            case 1:
                C1435l c1435l = (C1435l) this.f18889l;
                int i7 = this.f18892l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC9354l interfaceC9354l = c1435l.f3619l;
                    this.f18889l = null;
                    this.f18892l = 1;
                    if (AbstractC10158l.crashlytics(interfaceC9354l, (InterfaceC8639l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i8 = this.f18892l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C0071l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC7702l interfaceC7702l = (InterfaceC7702l) this.f18889l;
                int i9 = this.f18892l;
                try {
                    if (i9 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l = AbstractC6025l.yandex;
                        C0071l c0071l = (C0071l) obj2;
                        C6760l c6760l = C9658l.f19699l;
                        long jTapsense = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l = new C9181l(c0071l, interfaceC7702l, interfaceC14029l, i4);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense, c9181l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i9 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l = Unit.INSTANCE;
                    break;
                } catch (Throwable th3) {
                    c18435l = new C18435l(th3);
                }
                Throwable thYandex = C1171l.yandex(c18435l);
                if (thYandex != null) {
                    C15589l c15589l = C5013l.yandex;
                    C5013l.amazon(thYandex, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C11841l.class.getName())));
                }
                return Unit.INSTANCE;
            case 4:
                int i10 = this.f18892l;
                if (i10 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C14424l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i10 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC7702l interfaceC7702l2 = (InterfaceC7702l) this.f18889l;
                int i11 = this.f18892l;
                try {
                    if (i11 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l2 = AbstractC6025l.yandex;
                        C14424l c14424l = (C14424l) obj2;
                        C6760l c6760l2 = C9658l.f19699l;
                        long jTapsense2 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l2 = new C9181l(c14424l, interfaceC7702l2, interfaceC14029l, 4);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense2, c9181l2, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i11 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l2 = Unit.INSTANCE;
                    break;
                } catch (Throwable th4) {
                    c18435l2 = new C18435l(th4);
                }
                Throwable thYandex2 = C1171l.yandex(c18435l2);
                if (thYandex2 != null) {
                    C15589l c15589l2 = C5013l.yandex;
                    C5013l.amazon(thYandex2, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C5075l.class.getName())));
                }
                return Unit.INSTANCE;
            case 6:
                int i12 = this.f18892l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C14424l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i12 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC7702l interfaceC7702l3 = (InterfaceC7702l) this.f18889l;
                int i13 = this.f18892l;
                try {
                    if (i13 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l3 = AbstractC6025l.yandex;
                        C14424l c14424l2 = (C14424l) obj2;
                        C6760l c6760l3 = C9658l.f19699l;
                        long jTapsense3 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l3 = new C9181l(c14424l2, interfaceC7702l3, interfaceC14029l, i2);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense3, c9181l3, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i13 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l3 = Unit.INSTANCE;
                    break;
                } catch (Throwable th5) {
                    c18435l3 = new C18435l(th5);
                }
                Throwable thYandex3 = C1171l.yandex(c18435l3);
                if (thYandex3 != null) {
                    C15589l c15589l3 = C5013l.yandex;
                    C5013l.amazon(thYandex3, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C1725l.class.getName())));
                }
                return Unit.INSTANCE;
            case 8:
                int i14 = this.f18892l;
                if (i14 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C14424l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i14 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC7702l interfaceC7702l4 = (InterfaceC7702l) this.f18889l;
                int i15 = this.f18892l;
                try {
                    if (i15 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l4 = AbstractC6025l.yandex;
                        C14424l c14424l3 = (C14424l) obj2;
                        C6760l c6760l4 = C9658l.f19699l;
                        long jTapsense4 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l4 = new C9181l(c14424l3, interfaceC7702l4, interfaceC14029l, 8);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense4, c9181l4, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i15 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l4 = Unit.INSTANCE;
                    break;
                } catch (Throwable th6) {
                    c18435l4 = new C18435l(th6);
                }
                Throwable thYandex4 = C1171l.yandex(c18435l4);
                if (thYandex4 != null) {
                    C15589l c15589l4 = C5013l.yandex;
                    C5013l.amazon(thYandex4, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C7106l.class.getName())));
                }
                return Unit.INSTANCE;
            case 10:
                int i16 = this.f18892l;
                if (i16 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C14424l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i16 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 11:
                InterfaceC7702l interfaceC7702l5 = (InterfaceC7702l) this.f18889l;
                int i17 = this.f18892l;
                try {
                    if (i17 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l5 = AbstractC6025l.yandex;
                        C14424l c14424l4 = (C14424l) obj2;
                        C6760l c6760l5 = C9658l.f19699l;
                        long jTapsense5 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l5 = new C9181l(c14424l4, interfaceC7702l5, interfaceC14029l, 10);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense5, c9181l5, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i17 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l5 = Unit.INSTANCE;
                    break;
                } catch (Throwable th7) {
                    c18435l5 = new C18435l(th7);
                }
                Throwable thYandex5 = C1171l.yandex(c18435l5);
                if (thYandex5 != null) {
                    C15589l c15589l5 = C5013l.yandex;
                    C5013l.amazon(thYandex5, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C12879l.class.getName())));
                }
                return Unit.INSTANCE;
            case 12:
                int i18 = this.f18892l;
                if (i18 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C9181l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i18 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 13:
                int i19 = this.f18892l;
                if (i19 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C14424l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i19 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 14:
                InterfaceC7702l interfaceC7702l6 = (InterfaceC7702l) this.f18889l;
                int i20 = this.f18892l;
                try {
                    if (i20 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l6 = AbstractC6025l.yandex;
                        C14424l c14424l5 = (C14424l) obj2;
                        C6760l c6760l6 = C9658l.f19699l;
                        long jTapsense6 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l6 = new C9181l(c14424l5, interfaceC7702l6, interfaceC14029l, 13);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense6, c9181l6, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i20 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l6 = Unit.INSTANCE;
                    break;
                } catch (Throwable th8) {
                    c18435l6 = new C18435l(th8);
                }
                Throwable thYandex6 = C1171l.yandex(c18435l6);
                if (thYandex6 != null) {
                    C15589l c15589l6 = C5013l.yandex;
                    C5013l.amazon(thYandex6, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C11134l.class.getName())));
                }
                return Unit.INSTANCE;
            case 15:
                int i21 = this.f18892l;
                if (i21 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C14424l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i21 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 16:
                InterfaceC7702l interfaceC7702l7 = (InterfaceC7702l) this.f18889l;
                int i22 = this.f18892l;
                try {
                    if (i22 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l7 = AbstractC6025l.yandex;
                        C14424l c14424l6 = (C14424l) obj2;
                        C6760l c6760l7 = C9658l.f19699l;
                        long jTapsense7 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l7 = new C9181l(c14424l6, interfaceC7702l7, interfaceC14029l, 15);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense7, c9181l7, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i22 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l7 = Unit.INSTANCE;
                    break;
                } catch (Throwable th9) {
                    c18435l7 = new C18435l(th9);
                }
                Throwable thYandex7 = C1171l.yandex(c18435l7);
                if (thYandex7 != null) {
                    C15589l c15589l7 = C5013l.yandex;
                    C5013l.amazon(thYandex7, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", InterfaceC15432l.class.getName())));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int i23 = this.f18892l;
                if (i23 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C0985l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i23 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC7702l interfaceC7702l8 = (InterfaceC7702l) this.f18889l;
                int i24 = this.f18892l;
                try {
                    if (i24 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l8 = AbstractC6025l.yandex;
                        C0985l c0985l = (C0985l) obj2;
                        C6760l c6760l8 = C9658l.f19699l;
                        long jTapsense8 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l8 = new C9181l(c0985l, interfaceC7702l8, interfaceC14029l, 17);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense8, c9181l8, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i24 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l8 = Unit.INSTANCE;
                    break;
                } catch (Throwable th10) {
                    c18435l8 = new C18435l(th10);
                }
                Throwable thYandex8 = C1171l.yandex(c18435l8);
                if (thYandex8 != null) {
                    C15589l c15589l8 = C5013l.yandex;
                    C5013l.amazon(thYandex8, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C9098l.class.getName())));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC7702l interfaceC7702l9 = (InterfaceC7702l) this.f18889l;
                int i25 = this.f18892l;
                try {
                    if (i25 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l9 = AbstractC6025l.yandex;
                        C9181l c9181l9 = (C9181l) obj2;
                        C6760l c6760l9 = C9658l.f19699l;
                        long jTapsense9 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l10 = new C9181l(c9181l9, interfaceC7702l9, interfaceC14029l, 12);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense9, c9181l10, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i25 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l9 = Unit.INSTANCE;
                    break;
                } catch (Throwable th11) {
                    c18435l9 = new C18435l(th11);
                }
                Throwable thYandex9 = C1171l.yandex(c18435l9);
                if (thYandex9 != null) {
                    C15589l c15589l9 = C5013l.yandex;
                    C5013l.amazon(thYandex9, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C1320l.class.getName())));
                }
                return Unit.INSTANCE;
            case 20:
                int i26 = this.f18892l;
                if (i26 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C0985l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i26 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 21:
                InterfaceC7702l interfaceC7702l10 = (InterfaceC7702l) this.f18889l;
                int i27 = this.f18892l;
                try {
                    if (i27 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l10 = AbstractC6025l.yandex;
                        C0985l c0985l2 = (C0985l) obj2;
                        C6760l c6760l10 = C9658l.f19699l;
                        long jTapsense10 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l11 = new C9181l(c0985l2, interfaceC7702l10, interfaceC14029l, 20);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense10, c9181l11, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i27 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l10 = Unit.INSTANCE;
                    break;
                } catch (Throwable th12) {
                    c18435l10 = new C18435l(th12);
                }
                Throwable thYandex10 = C1171l.yandex(c18435l10);
                if (thYandex10 != null) {
                    C15589l c15589l10 = C5013l.yandex;
                    C5013l.amazon(thYandex10, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C4097l.class.getName())));
                }
                return Unit.INSTANCE;
            case 22:
                int i28 = this.f18892l;
                if (i28 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C14424l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i28 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 23:
                InterfaceC7702l interfaceC7702l11 = (InterfaceC7702l) this.f18889l;
                int i29 = this.f18892l;
                try {
                    if (i29 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l11 = AbstractC6025l.yandex;
                        C14424l c14424l7 = (C14424l) obj2;
                        C6760l c6760l11 = C9658l.f19699l;
                        long jTapsense11 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l12 = new C9181l(c14424l7, interfaceC7702l11, interfaceC14029l, 22);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense11, c9181l12, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i29 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l11 = Unit.INSTANCE;
                    break;
                } catch (Throwable th13) {
                    c18435l11 = new C18435l(th13);
                }
                Throwable thYandex11 = C1171l.yandex(c18435l11);
                if (thYandex11 != null) {
                    C15589l c15589l11 = C5013l.yandex;
                    C5013l.amazon(thYandex11, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C6946l.class.getName())));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                int i30 = this.f18892l;
                if (i30 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C14424l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i30 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                InterfaceC7702l interfaceC7702l12 = (InterfaceC7702l) this.f18889l;
                int i31 = this.f18892l;
                try {
                    if (i31 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l12 = AbstractC6025l.yandex;
                        C14424l c14424l8 = (C14424l) obj2;
                        C6760l c6760l12 = C9658l.f19699l;
                        long jTapsense12 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l13 = new C9181l(c14424l8, interfaceC7702l12, interfaceC14029l, 24);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense12, c9181l13, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i31 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l12 = Unit.INSTANCE;
                    break;
                } catch (Throwable th14) {
                    c18435l12 = new C18435l(th14);
                }
                Throwable thYandex12 = C1171l.yandex(c18435l12);
                if (thYandex12 != null) {
                    C15589l c15589l12 = C5013l.yandex;
                    C5013l.amazon(thYandex12, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C14759l.class.getName())));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return pro(obj);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C10507l c10507l = (C10507l) this.f18889l;
                int i32 = this.f18892l;
                if (i32 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    String str3 = ((UmaTrack) c10507l.loadAd).tapsense;
                    if (str3 == null) {
                        return Unit.INSTANCE;
                    }
                    C16534l c16534l = new C16534l(new String[]{str3});
                    this.f18892l = 1;
                    objAdmob = AbstractC8189l.admob(c16534l, this);
                    if (objAdmob == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i32 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objAdmob = obj;
                }
                AudioTrack audioTrack = (AudioTrack) AbstractC16901l.m4217extends((List) objAdmob);
                if (audioTrack != null) {
                    C9879l c9879l = (C9879l) obj2;
                    int i33 = C4456l.f9065l;
                    AbstractC4115l.amazon(audioTrack, new C12858l(c9879l, c10507l, 1)).Signature(c9879l.yandex);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                int i34 = this.f18892l;
                if (i34 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18892l = 1;
                    if (((C5165l) this.f18889l).invoke((InterfaceC7702l) obj2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i34 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                InterfaceC7702l interfaceC7702l13 = (InterfaceC7702l) this.f18889l;
                int i35 = this.f18892l;
                try {
                    if (i35 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l13 = AbstractC6025l.yandex;
                        C5165l c5165l = (C5165l) obj2;
                        C6760l c6760l13 = C9658l.f19699l;
                        long jTapsense13 = AbstractC15918l.tapsense(30, enumC16636l);
                        C9181l c9181l14 = new C9181l(c5165l, interfaceC7702l13, interfaceC14029l, i3);
                        this.f18889l = null;
                        this.f18892l = 1;
                        if (AbstractC15342l.mopub(jTapsense13, c9181l14, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i35 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l13 = Unit.INSTANCE;
                    break;
                } catch (Throwable th15) {
                    c18435l13 = new C18435l(th15);
                }
                Throwable thYandex13 = C1171l.yandex(c18435l13);
                if (thYandex13 != null) {
                    C15589l c15589l13 = C5013l.yandex;
                    C5013l.amazon(thYandex13, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C1725l.class.getName())));
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f18891l;
        Object obj2 = this.f18890l;
        switch (i) {
            case 0:
                return new C9181l((String) obj2, interfaceC14029l, 0);
            case 1:
                C9181l c9181l = new C9181l((InterfaceC8639l) obj2, interfaceC14029l, 1);
                c9181l.f18889l = obj;
                return c9181l;
            case 2:
                return new C9181l((C0071l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 2);
            case 3:
                C9181l c9181l2 = new C9181l((C0071l) obj2, interfaceC14029l, 3);
                c9181l2.f18889l = obj;
                return c9181l2;
            case 4:
                return new C9181l((C14424l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 4);
            case 5:
                C9181l c9181l3 = new C9181l((C14424l) obj2, interfaceC14029l, 5);
                c9181l3.f18889l = obj;
                return c9181l3;
            case 6:
                return new C9181l((C14424l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 6);
            case 7:
                C9181l c9181l4 = new C9181l((C14424l) obj2, interfaceC14029l, 7);
                c9181l4.f18889l = obj;
                return c9181l4;
            case 8:
                return new C9181l((C14424l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 8);
            case 9:
                C9181l c9181l5 = new C9181l((C14424l) obj2, interfaceC14029l, 9);
                c9181l5.f18889l = obj;
                return c9181l5;
            case 10:
                return new C9181l((C14424l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 10);
            case 11:
                C9181l c9181l6 = new C9181l((C14424l) obj2, interfaceC14029l, 11);
                c9181l6.f18889l = obj;
                return c9181l6;
            case 12:
                return new C9181l((C9181l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 12);
            case 13:
                return new C9181l((C14424l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 13);
            case 14:
                C9181l c9181l7 = new C9181l((C14424l) obj2, interfaceC14029l, 14);
                c9181l7.f18889l = obj;
                return c9181l7;
            case 15:
                return new C9181l((C14424l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 15);
            case 16:
                C9181l c9181l8 = new C9181l((C14424l) obj2, interfaceC14029l, 16);
                c9181l8.f18889l = obj;
                return c9181l8;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C9181l((C0985l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C9181l c9181l9 = new C9181l((C0985l) obj2, interfaceC14029l, 18);
                c9181l9.f18889l = obj;
                return c9181l9;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C9181l c9181l10 = new C9181l((C9181l) obj2, interfaceC14029l, 19);
                c9181l10.f18889l = obj;
                return c9181l10;
            case 20:
                return new C9181l((C0985l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 20);
            case 21:
                C9181l c9181l11 = new C9181l((C0985l) obj2, interfaceC14029l, 21);
                c9181l11.f18889l = obj;
                return c9181l11;
            case 22:
                return new C9181l((C14424l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 22);
            case 23:
                C9181l c9181l12 = new C9181l((C14424l) obj2, interfaceC14029l, 23);
                c9181l12.f18889l = obj;
                return c9181l12;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C9181l((C14424l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C9181l c9181l13 = new C9181l((C14424l) obj2, interfaceC14029l, 25);
                c9181l13.f18889l = obj;
                return c9181l13;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C9181l c9181l14 = new C9181l((C9879l) obj2, interfaceC14029l, 26);
                c9181l14.f18889l = obj;
                return c9181l14;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C9181l((C10507l) this.f18889l, (C9879l) obj2, interfaceC14029l, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C9181l((C5165l) this.f18889l, (InterfaceC7702l) obj2, interfaceC14029l, 28);
            default:
                C9181l c9181l15 = new C9181l((C5165l) obj2, interfaceC14029l, 29);
                c9181l15.f18889l = obj;
                return c9181l15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18891l) {
            case 0:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C9181l) ads((InterfaceC14029l) obj2, (C1435l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C9181l) ads((InterfaceC14029l) obj2, (C1320l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C9181l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9181l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18891l = i;
        this.f18890l = obj;
    }
}
