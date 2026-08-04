package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12586l extends AbstractC11340l implements InterfaceC13202l, InterfaceC17612l, InterfaceC16031l, InterfaceC5960l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public C5321l f24774l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C18395l f24775l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C1311l f24776l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C7119l f24777l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C2403l f24778l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public C6160l f24779l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public boolean f24780l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f24781l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public EnumC7283l f24782l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public C18367l f24783l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C18395l f24784l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public C0699l f24785l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public C4370l f24786l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public long f24787l = 0;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public AbstractC0775l f24788l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public C3253l f24789l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public C17545l f24790l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public Function1 f24791l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f24792l;

    public AbstractC12586l(Function1 function1, boolean z, C2403l c2403l, EnumC7283l enumC7283l) {
        this.f24782l = enumC7283l;
        this.f24791l = function1;
        this.f24781l = z;
        this.f24778l = c2403l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public static final Object m3405l(AbstractC12586l abstractC12586l, C1917l c1917l, AbstractC0283l abstractC0283l) {
        C16988l c16988l;
        C2403l c2403l;
        C1311l c1311l;
        C1917l c1917l2;
        C1311l c1311l2;
        if (abstractC0283l instanceof C16988l) {
            c16988l = (C16988l) abstractC0283l;
            int i = c16988l.f33112l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16988l.f33112l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16988l = new C16988l(abstractC12586l, abstractC0283l);
            }
        } else {
            c16988l = new C16988l(abstractC12586l, abstractC0283l);
        }
        Object obj = c16988l.f33115l;
        int i2 = c16988l.f33112l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C1311l c1311l3 = abstractC12586l.f24776l;
            if (c1311l3 != null && (c2403l = abstractC12586l.f24778l) != null) {
                C15366l c15366l = new C15366l(c1311l3);
                c16988l.f33114l = c1917l;
                c16988l.f33112l = 1;
                if (c2403l.yandex(c15366l, c16988l) != enumC9342l) {
                }
                return enumC9342l;
            }
            abstractC12586l.f24776l = c1311l;
            abstractC12586l.mo829l(c1917l.yandex);
            return Unit.INSTANCE;
        }
        if (i2 == 1) {
            c1917l = c16988l.f33114l;
            AbstractC2829l.crashlytics(obj);
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1311l2 = c16988l.f33113l;
            c1917l2 = c16988l.f33114l;
            AbstractC2829l.crashlytics(obj);
        }
        c1311l = c1311l2;
        c1917l = c1917l2;
        abstractC12586l.f24776l = c1311l;
        abstractC12586l.mo829l(c1917l.yandex);
        return Unit.INSTANCE;
        c1311l = new C1311l();
        C2403l c2403l2 = abstractC12586l.f24778l;
        if (c2403l2 != null) {
            c16988l.f33114l = c1917l;
            c16988l.f33113l = c1311l;
            c16988l.f33112l = 2;
            if (c2403l2.yandex(c1311l, c16988l) != enumC9342l) {
                c1917l2 = c1917l;
                c1311l2 = c1311l;
                c1311l = c1311l2;
                c1917l = c1917l2;
            }
            return enumC9342l;
        }
        abstractC12586l.f24776l = c1311l;
        abstractC12586l.mo829l(c1917l.yandex);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public static void m3406l(AbstractC12586l abstractC12586l, C15730l c15730l, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        C17545l c17545l = abstractC12586l.f24790l;
        if (c17545l == null) {
            c17545l = new C17545l();
            c17545l.crashlytics = null;
            c17545l.amazon = Long.MAX_VALUE;
            c17545l.purchase = false;
            abstractC12586l.f24790l = c17545l;
        }
        c17545l.crashlytics = c15730l;
        c17545l.amazon = j;
        C3253l c3253l = abstractC12586l.f24789l;
        EnumC7283l enumC7283l = abstractC12586l.f24782l;
        if (c3253l == null) {
            abstractC12586l.f24789l = new C3253l(enumC7283l, 2);
        } else {
            c3253l.f6947l = enumC7283l;
            c3253l.f6948l = j2;
        }
        c17545l.purchase = false;
        abstractC12586l.f24788l = c17545l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public static final Object m3407l(AbstractC12586l abstractC12586l, C5685l c5685l, AbstractC0283l abstractC0283l) throws Throwable {
        C1161l c1161l;
        if (abstractC0283l instanceof C1161l) {
            c1161l = (C1161l) abstractC0283l;
            int i = c1161l.f3140l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1161l.f3140l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1161l = new C1161l(abstractC12586l, abstractC0283l);
            }
        } else {
            c1161l = new C1161l(abstractC12586l, abstractC0283l);
        }
        Object obj = c1161l.f3141l;
        int i2 = c1161l.f3140l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C1311l c1311l = abstractC12586l.f24776l;
            if (c1311l != null) {
                C2403l c2403l = abstractC12586l.f24778l;
                if (c2403l != null) {
                    C15758l c15758l = new C15758l(c1311l);
                    c1161l.f3142l = c5685l;
                    c1161l.f3140l = 1;
                    Object objYandex = c2403l.yandex(c15758l, c1161l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objYandex == enumC9342l) {
                        return enumC9342l;
                    }
                }
            }
            abstractC12586l.mo830l(c5685l);
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c5685l = c1161l.f3142l;
        AbstractC2829l.crashlytics(obj);
        abstractC12586l.f24776l = null;
        abstractC12586l.mo830l(c5685l);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public static final Object m3408l(AbstractC12586l abstractC12586l, AbstractC0283l abstractC0283l) throws Throwable {
        C0978l c0978l;
        if (abstractC0283l instanceof C0978l) {
            c0978l = (C0978l) abstractC0283l;
            int i = c0978l.f2694l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0978l.f2694l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0978l = new C0978l(abstractC12586l, abstractC0283l);
            }
        } else {
            c0978l = new C0978l(abstractC12586l, abstractC0283l);
        }
        Object obj = c0978l.f2693l;
        int i2 = c0978l.f2694l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C1311l c1311l = abstractC12586l.f24776l;
            if (c1311l != null) {
                C2403l c2403l = abstractC12586l.f24778l;
                if (c2403l != null) {
                    C15366l c15366l = new C15366l(c1311l);
                    c0978l.f2694l = 1;
                    Object objYandex = c2403l.yandex(c15366l, c0978l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objYandex == enumC9342l) {
                        return enumC9342l;
                    }
                }
            }
            abstractC12586l.mo830l(new C5685l(0L, false));
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        abstractC12586l.f24776l = null;
        abstractC12586l.mo830l(new C5685l(0L, false));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01ad  */
    public void appmetrica(C9185l c9185l, EnumC9065l enumC9065l, long j) {
        Object obj;
        Object obj2;
        EnumC9065l enumC9065l2;
        Object obj3;
        boolean z;
        Object obj4;
        Object obj5;
        int i = 1;
        this.f24780l = true;
        if (this.f24781l) {
            if (this.f24775l == null) {
                C18395l c18395l = new C18395l(this);
                m3069l(c18395l);
                this.f24775l = c18395l;
            }
            if (this.f24788l == null) {
                C0699l c0699l = this.f24785l;
                if (c0699l == null) {
                    c0699l = new C0699l();
                    c0699l.crashlytics = 3;
                    c0699l.amazon = false;
                    c0699l.purchase = false;
                    this.f24785l = c0699l;
                }
                this.f24788l = c0699l;
            }
            AbstractC0775l abstractC0775l = this.f24788l;
            if (abstractC0775l == null) {
                C8339l.metrica("currentDragState should not be null");
                return;
            }
            boolean z2 = abstractC0775l instanceof C0699l;
            EnumC9065l enumC9065l3 = EnumC9065l.f18654l;
            EnumC9065l enumC9065l4 = EnumC9065l.f18653l;
            if (z2) {
                C0699l c0699l2 = (C0699l) abstractC0775l;
                if (!c9185l.yandex.isEmpty() && AbstractC18112l.billing(c9185l, false, false)) {
                    C15730l c15730l = (C15730l) AbstractC16901l.m4231native(c9185l.yandex);
                    int i2 = AbstractC1961l.yandex[AbstractC5020l.inmobi(c0699l2.crashlytics)] == 1 ? !mo828l() ? 1 : 2 : c0699l2.crashlytics;
                    c0699l2.crashlytics = i2;
                    if (enumC9065l == enumC9065l3) {
                        if (i2 == 2) {
                            c15730l.yandex();
                            c0699l2.amazon = true;
                        }
                        c0699l2.purchase = true;
                    }
                    if (enumC9065l == enumC9065l4) {
                        if (i2 == 1) {
                            m3406l(this, c15730l, c15730l.yandex, 0L, 12);
                            return;
                        }
                        if (c0699l2.amazon) {
                            m3411l(c15730l, c15730l, 0L);
                            m3413l(0L, c15730l);
                            long j2 = c15730l.yandex;
                            C4370l c4370l = this.f24786l;
                            if (c4370l == null) {
                                c4370l = new C4370l();
                                c4370l.crashlytics = Long.MAX_VALUE;
                                this.f24786l = c4370l;
                            }
                            c4370l.crashlytics = j2;
                            this.f24788l = c4370l;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z3 = abstractC0775l instanceof C17545l;
            EnumC9065l enumC9065l5 = EnumC9065l.f18652l;
            if (!z3) {
                if (abstractC0775l instanceof C18367l) {
                    C18367l c18367l = (C18367l) abstractC0775l;
                    if (enumC9065l != enumC9065l5) {
                        return;
                    }
                    List list = c9185l.yandex;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (((C15730l) list.get(i3)).crashlytics()) {
                            i = 0;
                            break;
                        }
                    }
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (((C15730l) list.get(i4)).amazon) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (i != 0) {
                                long jAdmob = C1187l.admob(((C15730l) AbstractC16901l.m4231native(list)).crashlytics, c18367l.crashlytics.crashlytics);
                                C15730l c15730l2 = c18367l.crashlytics;
                                if (c15730l2 != null) {
                                    m3406l(this, c15730l2, c18367l.amazon, jAdmob, 8);
                                    return;
                                } else {
                                    C8339l.metrica("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    m3414l();
                    return;
                }
                if (!(abstractC0775l instanceof C4370l)) {
                    C18725l.billing();
                    return;
                }
                C4370l c4370l2 = (C4370l) abstractC0775l;
                if (enumC9065l != enumC9065l4) {
                    return;
                }
                long j3 = c4370l2.crashlytics;
                List list2 = c9185l.yandex;
                int size3 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i5);
                    if (AbstractC17265l.purchase(((C15730l) obj).yandex, j3)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                C15730l c15730l3 = (C15730l) obj;
                if (c15730l3 == null) {
                    return;
                }
                boolean zBilling = AbstractC3474l.billing(c15730l3);
                Object obj6 = C5988l.yandex;
                if (!zBilling) {
                    if (c15730l3.crashlytics()) {
                        m3409l().amazon(obj6);
                        return;
                    } else {
                        if (C1187l.crashlytics(AbstractC3474l.subs(c15730l3, true)) == 0.0f) {
                            return;
                        }
                        m3413l(AbstractC3474l.subs(c15730l3, false), c15730l3);
                        c15730l3.yandex();
                        return;
                    }
                }
                List list3 = c9185l.yandex;
                int size4 = list3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list3.get(i6);
                    if (((C15730l) obj2).amazon) {
                        break;
                    } else {
                        i6++;
                    }
                }
                C15730l c15730l4 = (C15730l) obj2;
                if (c15730l4 != null) {
                    c4370l2.crashlytics = c15730l4.yandex;
                    return;
                }
                if (c15730l3.crashlytics() || !AbstractC3474l.billing(c15730l3)) {
                    m3409l().amazon(obj6);
                } else {
                    AbstractC16358l.loadAd(m3412l(), c15730l3);
                    float fPurchase = ((InterfaceC3114l) AbstractC13402l.loadAd(this, AbstractC4751l.tapsense)).purchase();
                    long jLoadAd = m3412l().loadAd(AbstractC12311l.mopub(fPurchase, fPurchase));
                    C8043l c8043l = (C8043l) m3412l().f11449l;
                    C13507l c13507l = (C13507l) c8043l.f16742l;
                    AbstractC8669l.m2414strictfp(c13507l.amazon, null);
                    c13507l.purchase = 0;
                    C13507l c13507l2 = (C13507l) c8043l.f16741l;
                    AbstractC8669l.m2414strictfp(c13507l2.amazon, null);
                    c13507l2.purchase = 0;
                    c8043l.f16743l = 0L;
                    m3409l().amazon(new C5685l(AbstractC16318l.crashlytics(jLoadAd), false));
                    this.f24780l = false;
                }
                m3414l();
                return;
            }
            C17545l c17545l = (C17545l) abstractC0775l;
            if (enumC9065l == enumC9065l3) {
                return;
            }
            List list4 = c9185l.yandex;
            int size5 = list4.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size5) {
                    enumC9065l2 = enumC9065l5;
                    obj3 = null;
                    break;
                }
                obj3 = list4.get(i7);
                enumC9065l2 = enumC9065l5;
                if (AbstractC17265l.purchase(((C15730l) obj3).yandex, c17545l.amazon)) {
                    break;
                }
                i7++;
                enumC9065l5 = enumC9065l2;
            }
            C15730l c15730l5 = (C15730l) obj3;
            if (c15730l5 == null) {
                int size6 = list4.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list4.get(i8);
                    if (((C15730l) obj5).amazon) {
                        break;
                    } else {
                        i8++;
                    }
                }
                c15730l5 = (C15730l) obj5;
                if (c15730l5 == null) {
                    m3414l();
                    return;
                }
                c17545l.amazon = c15730l5.yandex;
            }
            if (enumC9065l == enumC9065l4) {
                if (c15730l5.crashlytics()) {
                    C15730l c15730l6 = c17545l.crashlytics;
                    if (c15730l6 == null) {
                        C8339l.metrica("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j4 = c17545l.amazon;
                    C3253l c3253l = this.f24789l;
                    if (c3253l == null) {
                        C8339l.metrica("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    m3416l(c15730l6, j4, c3253l);
                } else if (AbstractC3474l.billing(c15730l5)) {
                    int size7 = list4.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            obj4 = null;
                            break;
                        }
                        Object obj7 = list4.get(i9);
                        if (((C15730l) obj7).amazon) {
                            obj4 = obj7;
                            break;
                        }
                        i9++;
                    }
                    C15730l c15730l7 = (C15730l) obj4;
                    if (c15730l7 == null) {
                        m3414l();
                    } else {
                        c17545l.amazon = c15730l7.yandex;
                    }
                } else {
                    float fAdmob = AbstractC7289l.admob((InterfaceC3114l) AbstractC13402l.loadAd(this, AbstractC4751l.tapsense), c15730l5.subs);
                    C3253l c3253l2 = this.f24789l;
                    if (c3253l2 == null) {
                        C8339l.metrica("Touch slop detector not initialized.");
                        return;
                    }
                    long jPro = C3253l.pro(c3253l2, AbstractC3474l.subs(c15730l5, true), fAdmob);
                    if ((9223372034707292159L & jPro) != 9205357640488583168L) {
                        long jSubs = C1187l.subs(this.f24787l, AbstractC3474l.subs(c15730l5, false));
                        this.f24787l = jSubs;
                        float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.f24787l & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jSubs >> 32))))) * 57.29578f;
                        EnumC7283l enumC7283l = this.f24782l;
                        if (enumC7283l == null) {
                            z = true;
                        } else {
                            C12349l c12349l = AbstractC16318l.yandex;
                            if (enumC7283l != EnumC7283l.f15125l ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        C9122l c9122l = new C9122l();
                        C5724l c5724l = new C5724l(fAtan2, c9122l, i);
                        C12349l c12349l2 = AbstractC16318l.yandex;
                        AbstractC13359l.mopub(this, C18395l.f35931l, new C0786l(4, new C15079l(16, c5724l)));
                        if (z || !c9122l.f18750l) {
                            c15730l5.yandex();
                            m3411l(c17545l.crashlytics, c15730l5, jPro);
                            m3413l(jPro, c15730l5);
                            long j5 = c15730l5.yandex;
                            C4370l c4370l3 = this.f24786l;
                            if (c4370l3 == null) {
                                c4370l3 = new C4370l();
                                c4370l3.crashlytics = Long.MAX_VALUE;
                                this.f24786l = c4370l3;
                            }
                            c4370l3.crashlytics = j5;
                            this.f24788l = c4370l3;
                        } else {
                            c17545l.purchase = true;
                        }
                    } else {
                        c17545l.purchase = true;
                        this.f24787l = C1187l.subs(this.f24787l, AbstractC3474l.subs(c15730l5, true));
                    }
                }
            }
            if (enumC9065l == enumC9065l2 && c17545l.purchase) {
                if (!c15730l5.crashlytics()) {
                    c17545l.purchase = false;
                    return;
                }
                C15730l c15730l8 = c17545l.crashlytics;
                if (c15730l8 == null) {
                    C8339l.metrica("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j6 = c17545l.amazon;
                C3253l c3253l3 = this.f24789l;
                if (c3253l3 != null) {
                    m3416l(c15730l8, j6, c3253l3);
                } else {
                    C8339l.metrica("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    @Override // defpackage.InterfaceC5960l
    /* JADX INFO: renamed from: goto */
    public final EnumC7283l mo1916goto() {
        return this.f24782l;
    }

    @Override // defpackage.InterfaceC0421l
    /* JADX INFO: renamed from: interface */
    public final String mo531interface() {
        if (!this.f24781l) {
            return "idle";
        }
        AbstractC0775l abstractC0775l = this.f24788l;
        if (abstractC0775l instanceof C0699l) {
            return ((C0699l) abstractC0775l).purchase ? "waiting" : "idle";
        }
        if ((abstractC0775l instanceof C17545l) || (abstractC0775l instanceof C18367l)) {
            return "waiting";
        }
        return abstractC0775l instanceof C4370l ? "recognized" : "idle";
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        this.f24792l = false;
        m3418l();
        C18395l c18395l = this.f24784l;
        if (c18395l != null) {
            m3073l(c18395l);
        }
        C18395l c18395l2 = this.f24775l;
        if (c18395l2 != null) {
            m3073l(c18395l2);
        }
        this.f24784l = null;
        this.f24775l = null;
    }

    /* JADX INFO: renamed from: lؓۚ۟, reason: contains not printable characters */
    public final InterfaceC14592l m3409l() {
        C7119l c7119l = this.f24777l;
        if (c7119l != null) {
            return c7119l;
        }
        C8339l.metrica("Events channel not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public final void m3410l(Function1 function1, boolean z, C2403l c2403l, EnumC7283l enumC7283l, boolean z2) {
        this.f24791l = function1;
        boolean z3 = true;
        if (this.f24781l != z) {
            this.f24781l = z;
            if (!z) {
                C18395l c18395l = this.f24784l;
                if (c18395l != null) {
                    m3073l(c18395l);
                }
                C18395l c18395l2 = this.f24775l;
                if (c18395l2 != null) {
                    m3073l(c18395l2);
                }
                this.f24784l = null;
                this.f24775l = null;
                m3418l();
                this.f24779l = null;
            }
            z2 = true;
        }
        if (!AbstractC8576l.yandex(this.f24778l, c2403l)) {
            m3418l();
            this.f24778l = c2403l;
        }
        if (this.f24782l != enumC7283l) {
            this.f24782l = enumC7283l;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.f24780l;
            C5988l c5988l = C5988l.yandex;
            if (z4) {
                m3414l();
                if (this.f24792l) {
                    m3409l().amazon(c5988l);
                }
                this.f24774l = null;
            }
            C6160l c6160l = this.f24779l;
            if (c6160l != null) {
                c6160l.yandex();
                AbstractC12586l abstractC12586l = c6160l.f12965l;
                if (abstractC12586l.f24792l) {
                    abstractC12586l.m3417l(c5988l);
                }
                c6160l.f12962l = null;
                C14785l c14785l = c6160l.f12966l;
                c14785l.f28908l = 0;
                ((C9571l) c14785l.f28907l).loadAd = 0;
            }
        }
    }

    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    public final void m3411l(C15730l c15730l, C15730l c15730l2, long j) {
        if (this.f24774l == null) {
            this.f24774l = new C5321l(0);
        }
        AbstractC16358l.loadAd(m3412l(), c15730l);
        long jAdmob = C1187l.admob(c15730l2.crashlytics, j);
        if (((Boolean) this.f24791l.invoke(new C10829l(c15730l.subs))).booleanValue()) {
            if (!this.f24792l) {
                if (this.f24777l == null) {
                    this.f24777l = AbstractC12098l.yandex(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
                }
                m3415l();
            }
            m3409l().amazon(new C1917l(jAdmob));
        }
    }

    /* JADX INFO: renamed from: lؙؗٗ */
    public abstract boolean mo828l();

    /* JADX INFO: renamed from: lؚؚؔ */
    public abstract void mo829l(long j);

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ */
    public void mo1495l() {
        mo1500throw();
    }

    /* JADX INFO: renamed from: lًَٙ, reason: contains not printable characters */
    public final C5321l m3412l() {
        C5321l c5321l = this.f24774l;
        if (c5321l != null) {
            return c5321l;
        }
        C8339l.metrica("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    public final void m3413l(long j, C15730l c15730l) {
        this.f24787l = C1187l.subs(this.f24787l, j);
        AbstractC16358l.loadAd(m3412l(), c15730l);
        m3409l().amazon(new C3995l(j, false));
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public final void m3414l() {
        this.f24787l = 0L;
        C0699l c0699l = this.f24785l;
        if (c0699l == null) {
            c0699l = new C0699l();
            c0699l.crashlytics = 3;
            c0699l.amazon = false;
            c0699l.purchase = false;
            this.f24785l = c0699l;
        }
        c0699l.crashlytics = 3;
        c0699l.amazon = false;
        c0699l.purchase = false;
        this.f24788l = c0699l;
    }

    /* JADX INFO: renamed from: lُٔۨ */
    public abstract void mo830l(C5685l c5685l);

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public final void m3415l() {
        this.f24792l = true;
        if (this.f24777l == null) {
            this.f24777l = AbstractC12098l.yandex(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
        }
        AbstractC10999l.mopub(m3914l(), null, 0, new C2375l(this, null), 3);
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final /* synthetic */ boolean mo1497l() {
        return false;
    }

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public final void m3416l(C15730l c15730l, long j, C3253l c3253l) {
        C18367l c18367l = this.f24783l;
        if (c18367l == null) {
            c18367l = new C18367l();
            c18367l.crashlytics = null;
            c18367l.amazon = Long.MAX_VALUE;
            this.f24783l = c18367l;
        }
        c18367l.crashlytics = c15730l;
        c18367l.amazon = j;
        c3253l.f6948l = 0L;
        this.f24788l = c18367l;
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final void mo1498l() {
        mo1500throw();
    }

    /* JADX INFO: renamed from: lٕۗٞ, reason: contains not printable characters */
    public final void m3417l(AbstractC12600l abstractC12600l) {
        if ((abstractC12600l instanceof C1917l) && !this.f24792l) {
            this.f24792l = true;
            m3415l();
        }
        m3409l().amazon(abstractC12600l);
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final void m3418l() {
        C1311l c1311l = this.f24776l;
        if (c1311l != null) {
            C2403l c2403l = this.f24778l;
            if (c2403l != null) {
                c2403l.loadAd(new C15366l(c1311l));
            }
            this.f24776l = null;
        }
    }

    /* JADX INFO: renamed from: lٖۡٓ */
    public abstract Object mo831l(C2375l c2375l, C2375l c2375l2);

    @Override // defpackage.InterfaceC17612l
    public final void signatures(C13698l c13698l, EnumC9065l enumC9065l) {
        Object obj;
        Object obj2;
        char c;
        float f;
        float fIntBitsToFloat;
        Object obj3;
        C14153l c14153l;
        Object obj4;
        Object obj5;
        int i = c13698l.f26744l;
        ArrayList arrayList = (ArrayList) c13698l.f26743l;
        if (this.f24781l) {
            if (this.f24779l == null) {
                this.f24779l = new C6160l(this);
            }
            if (this.f24784l == null) {
                C18395l c18395l = new C18395l(this.f24779l);
                m3069l(c18395l);
                this.f24784l = c18395l;
            }
            C6160l c6160l = this.f24779l;
            if (c6160l != null) {
                AbstractC12586l abstractC12586l = c6160l.f12965l;
                if (c6160l.f12970l == null) {
                    C12218l c12218l = c6160l.f12964l;
                    if (c12218l == null) {
                        c12218l = new C12218l();
                        c12218l.loadAd = 3;
                        c12218l.crashlytics = false;
                        c12218l.amazon = false;
                        c6160l.f12964l = c12218l;
                    }
                    c6160l.f12970l = c12218l;
                }
                AbstractC15185l abstractC15185l = c6160l.f12970l;
                if (abstractC15185l == null) {
                    C8339l.metrica("currentDragState should not be null");
                    return;
                }
                boolean z = abstractC15185l instanceof C12218l;
                boolean z2 = true;
                EnumC9065l enumC9065l2 = EnumC9065l.f18654l;
                EnumC9065l enumC9065l3 = EnumC9065l.f18653l;
                if (z) {
                    C12218l c12218l2 = (C12218l) abstractC15185l;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!AbstractC17764l.loadAd((C14153l) arrayList.get(i2))) {
                            return;
                        }
                    }
                    C14153l c14153l2 = (C14153l) AbstractC16901l.m4231native(arrayList);
                    int i3 = AbstractC10772l.yandex[AbstractC5020l.inmobi(c12218l2.loadAd)] == 1 ? !abstractC12586l.mo828l() ? 1 : 2 : c12218l2.loadAd;
                    c12218l2.loadAd = i3;
                    if (enumC9065l == enumC9065l2) {
                        if (i3 == 2) {
                            c14153l2.subs = true;
                            c12218l2.crashlytics = true;
                        }
                        c12218l2.amazon = true;
                    }
                    if (enumC9065l == enumC9065l3) {
                        if (i3 == 1) {
                            C6160l.crashlytics(c6160l, c14153l2, c14153l2.yandex, 0L, 12);
                            return;
                        }
                        if (c12218l2.crashlytics) {
                            c6160l.billing(c14153l2, c14153l2, new C3272l(i), 0L);
                            c6160l.purchase(c14153l2, new C3272l(i), 0L);
                            long j = c14153l2.yandex;
                            C10141l c10141l = c6160l.f12961l;
                            if (c10141l == null) {
                                c10141l = new C10141l();
                                c10141l.loadAd = Long.MAX_VALUE;
                                c6160l.f12961l = c10141l;
                            }
                            c10141l.loadAd = j;
                            c6160l.f12970l = c10141l;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = abstractC15185l instanceof C18190l;
                EnumC9065l enumC9065l4 = EnumC9065l.f18652l;
                if (z3) {
                    C18190l c18190l = (C18190l) abstractC15185l;
                    if (enumC9065l == enumC9065l2) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            obj3 = null;
                            break;
                        }
                        obj3 = arrayList.get(i4);
                        int i5 = i4;
                        if (AbstractC17265l.purchase(((C14153l) obj3).yandex, c18190l.crashlytics)) {
                            break;
                        } else {
                            i4 = i5 + 1;
                        }
                    }
                    C14153l c14153l3 = (C14153l) obj3;
                    if (c14153l3 == null) {
                        int size3 = arrayList.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size3) {
                                obj5 = null;
                                break;
                            }
                            obj5 = arrayList.get(i6);
                            if (((C14153l) obj5).amazon) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        c14153l3 = (C14153l) obj5;
                        if (c14153l3 == null) {
                            c6160l.yandex();
                            return;
                        }
                        c18190l.crashlytics = c14153l3.yandex;
                    }
                    if (enumC9065l != enumC9065l3) {
                        c14153l = c14153l3;
                    } else if (c14153l3.subs) {
                        c14153l = c14153l3;
                        C14153l c14153l4 = c18190l.loadAd;
                        if (c14153l4 == null) {
                            C8339l.metrica("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j2 = c18190l.crashlytics;
                        C3253l c3253l = c6160l.f12963l;
                        if (c3253l == null) {
                            C8339l.metrica("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        c6160l.loadAd(c14153l4, j2, c3253l);
                    } else if (AbstractC17764l.yandex(c14153l3)) {
                        int size4 = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size4) {
                                obj4 = null;
                                break;
                            }
                            Object obj6 = arrayList.get(i7);
                            if (((C14153l) obj6).amazon) {
                                obj4 = obj6;
                                break;
                            }
                            i7++;
                        }
                        C14153l c14153l5 = (C14153l) obj4;
                        if (c14153l5 == null) {
                            c6160l.yandex();
                        } else {
                            c18190l.crashlytics = c14153l5.yandex;
                        }
                        c14153l = c14153l3;
                    } else {
                        InterfaceC3114l interfaceC3114l = (InterfaceC3114l) AbstractC13402l.loadAd(abstractC12586l, AbstractC4751l.tapsense);
                        float f2 = AbstractC7289l.yandex;
                        float fBilling = interfaceC3114l.billing();
                        C3253l c3253l2 = c6160l.f12963l;
                        if (c3253l2 == null) {
                            C8339l.metrica("Touch slop detector not initialized.");
                            return;
                        }
                        long jPro = C3253l.pro(c3253l2, AbstractC17764l.purchase(c14153l3, abstractC12586l.f24782l, new C3272l(i), true), fBilling);
                        if ((9223372034707292159L & jPro) != 9205357640488583168L) {
                            c14153l3.subs = true;
                            c14153l = c14153l3;
                            c6160l.billing(c18190l.loadAd, c14153l, new C3272l(i), jPro);
                            c6160l.purchase(c14153l, new C3272l(i), jPro);
                            long j3 = c14153l.yandex;
                            C10141l c10141l2 = c6160l.f12961l;
                            if (c10141l2 == null) {
                                c10141l2 = new C10141l();
                                c10141l2.loadAd = Long.MAX_VALUE;
                                c6160l.f12961l = c10141l2;
                            }
                            c10141l2.loadAd = j3;
                            c6160l.f12970l = c10141l2;
                        } else {
                            c14153l = c14153l3;
                            c18190l.amazon = true;
                        }
                    }
                    if (enumC9065l == enumC9065l4 && c18190l.amazon) {
                        if (!c14153l.subs) {
                            c18190l.amazon = false;
                            return;
                        }
                        C14153l c14153l6 = c18190l.loadAd;
                        if (c14153l6 == null) {
                            C8339l.metrica("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j4 = c18190l.crashlytics;
                        C3253l c3253l3 = c6160l.f12963l;
                        if (c3253l3 != null) {
                            c6160l.loadAd(c14153l6, j4, c3253l3);
                            return;
                        } else {
                            C8339l.metrica("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (abstractC15185l instanceof C14129l) {
                    C14129l c14129l = (C14129l) abstractC15185l;
                    if (enumC9065l != enumC9065l4) {
                        return;
                    }
                    int size5 = arrayList.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        if (((C14153l) arrayList.get(i8)).subs) {
                            z2 = false;
                            break;
                        }
                    }
                    int size6 = arrayList.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        if (((C14153l) arrayList.get(i9)).amazon) {
                            if (arrayList.isEmpty()) {
                                break;
                            }
                            if (z2) {
                                long jAdmob = C1187l.admob(AbstractC17764l.billing((C14153l) AbstractC16901l.m4231native(arrayList), abstractC12586l.f24782l, new C3272l(i)), AbstractC17764l.billing(c14129l.loadAd, abstractC12586l.f24782l, new C3272l(i)));
                                C14153l c14153l7 = c14129l.loadAd;
                                if (c14153l7 != null) {
                                    C6160l.crashlytics(c6160l, c14153l7, c14129l.crashlytics, jAdmob, 8);
                                    return;
                                } else {
                                    C8339l.metrica("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    c6160l.yandex();
                    return;
                }
                if (!(abstractC15185l instanceof C10141l)) {
                    C18725l.billing();
                    return;
                }
                C10141l c10141l3 = (C10141l) abstractC15185l;
                if (enumC9065l != enumC9065l3) {
                    return;
                }
                long j5 = c10141l3.loadAd;
                int size7 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size7) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i10);
                    if (AbstractC17265l.purchase(((C14153l) obj).yandex, j5)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                C14153l c14153l8 = (C14153l) obj;
                if (c14153l8 == null) {
                    return;
                }
                long j6 = c14153l8.crashlytics;
                boolean zYandex = AbstractC17764l.yandex(c14153l8);
                C5988l c5988l = C5988l.yandex;
                if (!zYandex) {
                    if (c14153l8.subs) {
                        abstractC12586l.m3417l(c5988l);
                        return;
                    } else {
                        if (C1187l.crashlytics(AbstractC17764l.purchase(c14153l8, abstractC12586l.f24782l, new C3272l(i), true)) == 0.0f) {
                            return;
                        }
                        c6160l.purchase(c14153l8, new C3272l(i), AbstractC17764l.purchase(c14153l8, abstractC12586l.f24782l, new C3272l(i), false));
                        c14153l8.subs = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size8) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i11);
                    if (((C14153l) obj2).amazon) {
                        break;
                    } else {
                        i11++;
                    }
                }
                C14153l c14153l9 = (C14153l) obj2;
                if (c14153l9 != null) {
                    c10141l3.loadAd = c14153l9.yandex;
                    return;
                }
                if (c14153l8.subs || !AbstractC17764l.yandex(c14153l8)) {
                    abstractC12586l.m3417l(c5988l);
                } else {
                    C5321l c5321lAmazon = c6160l.amazon();
                    EnumC7283l enumC7283l = abstractC12586l.f24782l;
                    C14785l c14785l = c6160l.f12969l;
                    C12463l c12463l = (C12463l) c14785l.f28907l;
                    char c2 = ' ';
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                    if (AbstractC17764l.loadAd(c14153l8)) {
                        c14785l.f28908l = 0;
                        c12463l.billing();
                    }
                    if (AbstractC17764l.yandex(c14153l8) || AbstractC17764l.loadAd(c14153l8)) {
                        c = ' ';
                        f = 0.0f;
                    } else {
                        if (c12463l.loadAd == 3) {
                            int i12 = c14785l.f28908l;
                            c14785l.f28908l = i12 + 1;
                            c12463l.startapp(i12, c14153l8);
                        } else {
                            c12463l.yandex(c14153l8);
                        }
                        if (c14785l.f28908l == 3) {
                            c14785l.f28908l = 0;
                        }
                        Object[] objArr = c12463l.yandex;
                        int i13 = c12463l.loadAd;
                        int i14 = 0;
                        float fIntBitsToFloat4 = 0.0f;
                        while (i14 < i13) {
                            char c3 = c2;
                            fIntBitsToFloat4 += Float.intBitsToFloat((int) (((C14153l) objArr[i14]).crashlytics >> c3));
                            i14++;
                            c2 = c3;
                        }
                        c = c2;
                        f = 0.0f;
                        int i15 = c12463l.loadAd;
                        fIntBitsToFloat2 = fIntBitsToFloat4 / i15;
                        Object[] objArr2 = c12463l.yandex;
                        float fIntBitsToFloat5 = 0.0f;
                        for (int i16 = 0; i16 < i15; i16++) {
                            fIntBitsToFloat5 += Float.intBitsToFloat((int) (((C14153l) objArr2[i16]).crashlytics & 4294967295L));
                        }
                        fIntBitsToFloat3 = fIntBitsToFloat5 / c12463l.loadAd;
                    }
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                    if (enumC7283l != null) {
                        if (i == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
                        } else if (i == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        }
                        jFloatToRawIntBits = enumC7283l == EnumC7283l.f15125l ? (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) : (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                    }
                    ((C8043l) c5321lAmazon.f11449l).billing(c14153l8.loadAd, jFloatToRawIntBits);
                    float fPurchase = ((InterfaceC3114l) AbstractC13402l.loadAd(abstractC12586l, AbstractC4751l.tapsense)).purchase();
                    long jLoadAd = c6160l.amazon().loadAd(AbstractC12311l.mopub(fPurchase, fPurchase));
                    C8043l c8043l = (C8043l) c6160l.amazon().f11449l;
                    C13507l c13507l = (C13507l) c8043l.f16742l;
                    AbstractC8669l.m2414strictfp(c13507l.amazon, null);
                    c13507l.purchase = 0;
                    C13507l c13507l2 = (C13507l) c8043l.f16741l;
                    AbstractC8669l.m2414strictfp(c13507l2.amazon, null);
                    c13507l2.purchase = 0;
                    c8043l.f16743l = 0L;
                    abstractC12586l.m3417l(new C5685l(AbstractC16318l.crashlytics(jLoadAd), true));
                }
                c6160l.yandex();
            }
        }
    }

    @Override // defpackage.InterfaceC13202l
    public final long tapsense() {
        return AbstractC10549l.yandex;
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: throw */
    public final void mo1500throw() {
        if (this.f24780l) {
            m3414l();
            if (this.f24792l) {
                m3409l().amazon(C5988l.yandex);
            }
            this.f24774l = null;
        }
        this.f24780l = false;
    }

    @Override // defpackage.InterfaceC17612l
    /* JADX INFO: renamed from: try */
    public final void mo1985try() {
        C6160l c6160l = this.f24779l;
        if (c6160l != null) {
            c6160l.yandex();
            AbstractC12586l abstractC12586l = c6160l.f12965l;
            if (abstractC12586l.f24792l) {
                abstractC12586l.m3417l(C5988l.yandex);
            }
            c6160l.f12962l = null;
            C14785l c14785l = c6160l.f12966l;
            c14785l.f28908l = 0;
            ((C9571l) c14785l.f28907l).loadAd = 0;
        }
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: class */
    public final /* synthetic */ void mo1493class() {
    }
}
