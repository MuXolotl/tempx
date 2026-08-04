package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lُٟٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11226l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C16076l f22598l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22599l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f22600l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11226l(C16076l c16076l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f22599l = i;
        this.f22598l = c16076l;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x0124  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:49:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x013f  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x0116, please report this as an issue */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C1320l c1320l;
        C11134l c11134l;
        C12879l c12879l;
        C7106l c7106l;
        C10507l c10507lCrashlytics;
        C1725l c1725l;
        C10507l c10507l;
        AbstractC18643l abstractC18643l;
        Long l;
        C5075l c5075l;
        C16811l c16811l;
        long j;
        long duration;
        int i = this.f22599l;
        int i2 = 0;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C16076l c16076l = this.f22598l;
        switch (i) {
            case 0:
                Context context = c16076l.f31508l;
                int i3 = this.f22600l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C12962l c12962l = new C12962l(context, new ComponentName(context, (Class<?>) PlaybackService.class));
                    context.getClass();
                    Bundle bundle = Bundle.EMPTY;
                    AbstractC15323l.isVip();
                    C3316l c3316l = c16076l.f31503l;
                    c3316l.getClass();
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    C6845l c6845l = new C6845l(mainLooper);
                    AbstractC15323l.m3966final(new Handler(mainLooper), new RunnableC8670l(c6845l, new C16811l(context, c12962l, bundle, c3316l, mainLooper, c6845l, c12962l.yandex.purchase() ? new C3797l(new C2205l(new appmetrica(context))) : null), 0));
                    this.f22600l = 1;
                    obj = AbstractC16840l.crashlytics(c6845l, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c16076l.f31499l = (C16811l) obj;
                return obj;
            default:
                C2258l c2258l = c16076l.f31521l;
                int i4 = 5;
                int i5 = 6;
                int i6 = 4;
                switch (this.f22600l) {
                    case 0:
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l = AbstractC6025l.yandex;
                        C14759l c14759l = new C14759l(c16076l.purchase(), ((Boolean) c16076l.admob(new C18606l(c16076l, 20))).booleanValue());
                        this.f22600l = 1;
                        if (AbstractC6025l.yandex(c14759l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        C8490l c8490l2 = AbstractC6025l.yandex;
                        c1320l = new C1320l(c2258l.billing());
                        this.f22600l = 2;
                        if (AbstractC6025l.yandex(c1320l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        C8490l c8490l3 = AbstractC6025l.yandex;
                        c11134l = new C11134l(c2258l.amazon);
                        this.f22600l = 3;
                        if (AbstractC6025l.yandex(c11134l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        C8490l c8490l4 = AbstractC6025l.yandex;
                        c12879l = new C12879l(c16076l.amazon());
                        this.f22600l = 4;
                        if (AbstractC6025l.yandex(c12879l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        C8490l c8490l5 = AbstractC6025l.yandex;
                        c7106l = new C7106l((EnumC12501l) c16076l.admob(new C18606l(c16076l, i5)));
                        this.f22600l = 5;
                        if (AbstractC6025l.yandex(c7106l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        c10507lCrashlytics = c16076l.crashlytics();
                        if (c10507lCrashlytics != null) {
                            C8490l c8490l6 = AbstractC6025l.yandex;
                            c10507l = (C10507l) c16076l.admob(new C18606l(c16076l, 12));
                            if (c10507l != null) {
                                abstractC18643l = c10507l.loadAd;
                            } else {
                                abstractC18643l = null;
                            }
                            C10507l c10507l2 = (C10507l) c16076l.admob(new C18606l(c16076l, i4));
                            c1725l = new C1725l(c10507lCrashlytics, abstractC18643l, c10507l2 != null ? c10507l2.loadAd : null, ((Number) c16076l.admob(new C18606l(c16076l, i6))).intValue());
                            this.f22600l = 6;
                            if (AbstractC6025l.yandex(c1725l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        l = (Long) c16076l.admob(new C18606l(c16076l, i2));
                        if (l != null) {
                            long jLongValue = l.longValue();
                            C8490l c8490l7 = AbstractC6025l.yandex;
                            c16811l = c16076l.f31499l;
                            if (c16811l != null) {
                                duration = c16811l.getDuration();
                                if (duration < 0) {
                                    duration = 0;
                                }
                                j = duration;
                            } else {
                                j = 0;
                            }
                            Long l2 = (Long) c16076l.admob(new C18606l(c16076l, 9));
                            c5075l = new C5075l(new C1100l(j, l2 != null ? l2.longValue() : 0L, jLongValue));
                            this.f22600l = 7;
                            if (AbstractC6025l.yandex(c5075l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l8 = AbstractC6025l.yandex;
                        c1320l = new C1320l(c2258l.billing());
                        this.f22600l = 2;
                        if (AbstractC6025l.yandex(c1320l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        C8490l c8490l9 = AbstractC6025l.yandex;
                        c11134l = new C11134l(c2258l.amazon);
                        this.f22600l = 3;
                        if (AbstractC6025l.yandex(c11134l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        C8490l c8490l10 = AbstractC6025l.yandex;
                        c12879l = new C12879l(c16076l.amazon());
                        this.f22600l = 4;
                        if (AbstractC6025l.yandex(c12879l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        C8490l c8490l11 = AbstractC6025l.yandex;
                        c7106l = new C7106l((EnumC12501l) c16076l.admob(new C18606l(c16076l, i5)));
                        this.f22600l = 5;
                        if (AbstractC6025l.yandex(c7106l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        c10507lCrashlytics = c16076l.crashlytics();
                        if (c10507lCrashlytics != null) {
                            C8490l c8490l12 = AbstractC6025l.yandex;
                            c10507l = (C10507l) c16076l.admob(new C18606l(c16076l, 12));
                            if (c10507l != null) {
                                abstractC18643l = c10507l.loadAd;
                            } else {
                                abstractC18643l = null;
                            }
                            C10507l c10507l3 = (C10507l) c16076l.admob(new C18606l(c16076l, i4));
                            c1725l = new C1725l(c10507lCrashlytics, abstractC18643l, c10507l3 != null ? c10507l3.loadAd : null, ((Number) c16076l.admob(new C18606l(c16076l, i6))).intValue());
                            this.f22600l = 6;
                            if (AbstractC6025l.yandex(c1725l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        l = (Long) c16076l.admob(new C18606l(c16076l, i2));
                        if (l != null) {
                            long jLongValue2 = l.longValue();
                            C8490l c8490l13 = AbstractC6025l.yandex;
                            c16811l = c16076l.f31499l;
                            if (c16811l != null) {
                                duration = c16811l.getDuration();
                                if (duration < 0) {
                                    duration = 0;
                                }
                                j = duration;
                            } else {
                                j = 0;
                            }
                            Long l3 = (Long) c16076l.admob(new C18606l(c16076l, 9));
                            c5075l = new C5075l(new C1100l(j, l3 != null ? l3.longValue() : 0L, jLongValue2));
                            this.f22600l = 7;
                            if (AbstractC6025l.yandex(c5075l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l14 = AbstractC6025l.yandex;
                        c11134l = new C11134l(c2258l.amazon);
                        this.f22600l = 3;
                        if (AbstractC6025l.yandex(c11134l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        C8490l c8490l15 = AbstractC6025l.yandex;
                        c12879l = new C12879l(c16076l.amazon());
                        this.f22600l = 4;
                        if (AbstractC6025l.yandex(c12879l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        C8490l c8490l16 = AbstractC6025l.yandex;
                        c7106l = new C7106l((EnumC12501l) c16076l.admob(new C18606l(c16076l, i5)));
                        this.f22600l = 5;
                        if (AbstractC6025l.yandex(c7106l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        c10507lCrashlytics = c16076l.crashlytics();
                        if (c10507lCrashlytics != null) {
                            C8490l c8490l17 = AbstractC6025l.yandex;
                            c10507l = (C10507l) c16076l.admob(new C18606l(c16076l, 12));
                            if (c10507l != null) {
                                abstractC18643l = c10507l.loadAd;
                            } else {
                                abstractC18643l = null;
                            }
                            C10507l c10507l4 = (C10507l) c16076l.admob(new C18606l(c16076l, i4));
                            c1725l = new C1725l(c10507lCrashlytics, abstractC18643l, c10507l4 != null ? c10507l4.loadAd : null, ((Number) c16076l.admob(new C18606l(c16076l, i6))).intValue());
                            this.f22600l = 6;
                            if (AbstractC6025l.yandex(c1725l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        l = (Long) c16076l.admob(new C18606l(c16076l, i2));
                        if (l != null) {
                            long jLongValue3 = l.longValue();
                            C8490l c8490l18 = AbstractC6025l.yandex;
                            c16811l = c16076l.f31499l;
                            if (c16811l != null) {
                                duration = c16811l.getDuration();
                                if (duration < 0) {
                                    duration = 0;
                                }
                                j = duration;
                            } else {
                                j = 0;
                            }
                            Long l4 = (Long) c16076l.admob(new C18606l(c16076l, 9));
                            c5075l = new C5075l(new C1100l(j, l4 != null ? l4.longValue() : 0L, jLongValue3));
                            this.f22600l = 7;
                            if (AbstractC6025l.yandex(c5075l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        return Unit.INSTANCE;
                    case 3:
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l19 = AbstractC6025l.yandex;
                        c12879l = new C12879l(c16076l.amazon());
                        this.f22600l = 4;
                        if (AbstractC6025l.yandex(c12879l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        C8490l c8490l110 = AbstractC6025l.yandex;
                        c7106l = new C7106l((EnumC12501l) c16076l.admob(new C18606l(c16076l, i5)));
                        this.f22600l = 5;
                        if (AbstractC6025l.yandex(c7106l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        c10507lCrashlytics = c16076l.crashlytics();
                        if (c10507lCrashlytics != null) {
                            C8490l c8490l111 = AbstractC6025l.yandex;
                            c10507l = (C10507l) c16076l.admob(new C18606l(c16076l, 12));
                            if (c10507l != null) {
                                abstractC18643l = c10507l.loadAd;
                            } else {
                                abstractC18643l = null;
                            }
                            C10507l c10507l5 = (C10507l) c16076l.admob(new C18606l(c16076l, i4));
                            c1725l = new C1725l(c10507lCrashlytics, abstractC18643l, c10507l5 != null ? c10507l5.loadAd : null, ((Number) c16076l.admob(new C18606l(c16076l, i6))).intValue());
                            this.f22600l = 6;
                            if (AbstractC6025l.yandex(c1725l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        l = (Long) c16076l.admob(new C18606l(c16076l, i2));
                        if (l != null) {
                            long jLongValue4 = l.longValue();
                            C8490l c8490l112 = AbstractC6025l.yandex;
                            c16811l = c16076l.f31499l;
                            if (c16811l != null) {
                                duration = c16811l.getDuration();
                                if (duration < 0) {
                                    duration = 0;
                                }
                                j = duration;
                            } else {
                                j = 0;
                            }
                            Long l5 = (Long) c16076l.admob(new C18606l(c16076l, 9));
                            c5075l = new C5075l(new C1100l(j, l5 != null ? l5.longValue() : 0L, jLongValue4));
                            this.f22600l = 7;
                            if (AbstractC6025l.yandex(c5075l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        return Unit.INSTANCE;
                    case 4:
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l113 = AbstractC6025l.yandex;
                        c7106l = new C7106l((EnumC12501l) c16076l.admob(new C18606l(c16076l, i5)));
                        this.f22600l = 5;
                        if (AbstractC6025l.yandex(c7106l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        c10507lCrashlytics = c16076l.crashlytics();
                        if (c10507lCrashlytics != null) {
                            C8490l c8490l114 = AbstractC6025l.yandex;
                            c10507l = (C10507l) c16076l.admob(new C18606l(c16076l, 12));
                            if (c10507l != null) {
                                abstractC18643l = c10507l.loadAd;
                            } else {
                                abstractC18643l = null;
                            }
                            C10507l c10507l6 = (C10507l) c16076l.admob(new C18606l(c16076l, i4));
                            c1725l = new C1725l(c10507lCrashlytics, abstractC18643l, c10507l6 != null ? c10507l6.loadAd : null, ((Number) c16076l.admob(new C18606l(c16076l, i6))).intValue());
                            this.f22600l = 6;
                            if (AbstractC6025l.yandex(c1725l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        l = (Long) c16076l.admob(new C18606l(c16076l, i2));
                        if (l != null) {
                            long jLongValue5 = l.longValue();
                            C8490l c8490l115 = AbstractC6025l.yandex;
                            c16811l = c16076l.f31499l;
                            if (c16811l != null) {
                                duration = c16811l.getDuration();
                                if (duration < 0) {
                                    duration = 0;
                                }
                                j = duration;
                            } else {
                                j = 0;
                            }
                            Long l6 = (Long) c16076l.admob(new C18606l(c16076l, 9));
                            c5075l = new C5075l(new C1100l(j, l6 != null ? l6.longValue() : 0L, jLongValue5));
                            this.f22600l = 7;
                            if (AbstractC6025l.yandex(c5075l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        return Unit.INSTANCE;
                    case 5:
                        AbstractC2829l.crashlytics(obj);
                        c10507lCrashlytics = c16076l.crashlytics();
                        if (c10507lCrashlytics != null) {
                            C8490l c8490l116 = AbstractC6025l.yandex;
                            c10507l = (C10507l) c16076l.admob(new C18606l(c16076l, 12));
                            if (c10507l != null) {
                                abstractC18643l = c10507l.loadAd;
                            } else {
                                abstractC18643l = null;
                            }
                            C10507l c10507l7 = (C10507l) c16076l.admob(new C18606l(c16076l, i4));
                            c1725l = new C1725l(c10507lCrashlytics, abstractC18643l, c10507l7 != null ? c10507l7.loadAd : null, ((Number) c16076l.admob(new C18606l(c16076l, i6))).intValue());
                            this.f22600l = 6;
                            if (AbstractC6025l.yandex(c1725l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        l = (Long) c16076l.admob(new C18606l(c16076l, i2));
                        if (l != null) {
                            long jLongValue6 = l.longValue();
                            C8490l c8490l117 = AbstractC6025l.yandex;
                            c16811l = c16076l.f31499l;
                            if (c16811l != null) {
                                duration = c16811l.getDuration();
                                if (duration < 0) {
                                    duration = 0;
                                }
                                j = duration;
                            } else {
                                j = 0;
                            }
                            Long l7 = (Long) c16076l.admob(new C18606l(c16076l, 9));
                            c5075l = new C5075l(new C1100l(j, l7 != null ? l7.longValue() : 0L, jLongValue6));
                            this.f22600l = 7;
                            if (AbstractC6025l.yandex(c5075l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        AbstractC2829l.crashlytics(obj);
                        l = (Long) c16076l.admob(new C18606l(c16076l, i2));
                        if (l != null) {
                            long jLongValue7 = l.longValue();
                            C8490l c8490l118 = AbstractC6025l.yandex;
                            c16811l = c16076l.f31499l;
                            if (c16811l != null) {
                                duration = c16811l.getDuration();
                                if (duration < 0) {
                                    duration = 0;
                                }
                                j = duration;
                            } else {
                                j = 0;
                            }
                            Long l8 = (Long) c16076l.admob(new C18606l(c16076l, 9));
                            c5075l = new C5075l(new C1100l(j, l8 != null ? l8.longValue() : 0L, jLongValue7));
                            this.f22600l = 7;
                            if (AbstractC6025l.yandex(c5075l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        return Unit.INSTANCE;
                    case 7:
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    default:
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f22599l;
        C16076l c16076l = this.f22598l;
        switch (i) {
            case 0:
                return new C11226l(c16076l, interfaceC14029l, 0);
            default:
                return new C11226l(c16076l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f22599l) {
            case 0:
                break;
        }
        return ((C11226l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
