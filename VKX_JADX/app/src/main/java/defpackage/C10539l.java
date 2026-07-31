package defpackage;

import android.database.SQLException;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَۙ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10539l implements InterfaceC12352l, InterfaceC17053l {
    public final boolean loadAd;
    public final C5203l yandex;
    public final C11315l crashlytics = new C11315l();
    public final AtomicBoolean amazon = new AtomicBoolean(false);

    public C10539l(C5203l c5203l, boolean z) {
        this.yandex = c5203l;
        this.loadAd = z;
    }

    @Override // defpackage.InterfaceC12352l
    public final Object amazon(AbstractC5563l abstractC5563l) {
        if (this.amazon.get()) {
            AbstractC13628l.smaato(21, "Connection is recycled");
            throw null;
        }
        C11008l c11008l = (C11008l) abstractC5563l.f1295l.mo245l(C11008l.f22177l);
        if (c11008l != null && c11008l.f22178l == this) {
            return Boolean.valueOf(!this.crashlytics.isEmpty());
        }
        AbstractC13628l.smaato(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object billing(boolean z, AbstractC0283l abstractC0283l) {
        C7681l c7681l;
        C5203l c5203l;
        if (abstractC0283l instanceof C7681l) {
            c7681l = (C7681l) abstractC0283l;
            int i = c7681l.f16110l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7681l.f16110l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7681l = new C7681l(this, abstractC0283l);
            }
        } else {
            c7681l = new C7681l(this, abstractC0283l);
        }
        Object obj = c7681l.f16106l;
        int i2 = c7681l.f16110l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c7681l.f16109l = this;
            c5203l = this.yandex;
            c7681l.f16108l = c5203l;
            c7681l.f16111l = z;
            c7681l.f16110l = 1;
            Object objYandex = c5203l.f11278l.yandex(c7681l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c7681l.f16111l;
            C5203l c5203l2 = c7681l.f16108l;
            C10539l c10539l = c7681l.f16109l;
            AbstractC2829l.crashlytics(obj);
            c5203l = c5203l2;
            this = c10539l;
        }
        try {
            C11315l c11315l = this.crashlytics;
            C5203l c5203l3 = this.yandex;
            if (c11315l.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            C1420l c1420l = (C1420l) AbstractC3984l.isVip(c11315l);
            if (z) {
                c1420l.getClass();
                if (c11315l.isEmpty()) {
                    AbstractC13628l.amazon(c5203l3, "END TRANSACTION");
                } else {
                    AbstractC13628l.amazon(c5203l3, "RELEASE SAVEPOINT '" + c1420l.yandex + '\'');
                }
            } else if (c11315l.isEmpty()) {
                AbstractC13628l.amazon(c5203l3, "ROLLBACK TRANSACTION");
            } else {
                AbstractC13628l.amazon(c5203l3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + c1420l.yandex + '\'');
            }
            Unit unit = Unit.INSTANCE;
            c5203l.billing(null);
            return unit;
        } catch (Throwable th) {
            c5203l.billing(null);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC17053l
    public final InterfaceC0684l crashlytics() {
        return this.yandex;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2679l
    public final Object loadAd(String str, Function1 function1, AbstractC0283l abstractC0283l) {
        C8246l c8246l;
        C5203l c5203l;
        if (abstractC0283l instanceof C8246l) {
            c8246l = (C8246l) abstractC0283l;
            int i = c8246l.f17137l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8246l.f17137l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8246l = new C8246l(this, abstractC0283l);
            }
        } else {
            c8246l = new C8246l(this, abstractC0283l);
        }
        Object obj = c8246l.f17136l;
        int i2 = c8246l.f17137l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (this.amazon.get()) {
                AbstractC13628l.smaato(21, "Connection is recycled");
                throw null;
            }
            C11008l c11008l = (C11008l) c8246l.f1295l.mo245l(C11008l.f22177l);
            if (c11008l == null || c11008l.f22178l != this) {
                AbstractC13628l.smaato(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            c8246l.f17139l = this;
            c8246l.f17138l = str;
            c8246l.f17141l = function1;
            c5203l = this.yandex;
            c8246l.f17135l = c5203l;
            c8246l.f17137l = 1;
            Object objYandex = c5203l.f11278l.yandex(c8246l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C5203l c5203l2 = c8246l.f17135l;
            function1 = c8246l.f17141l;
            str = c8246l.f17138l;
            C10539l c10539l = c8246l.f17139l;
            AbstractC2829l.crashlytics(obj);
            c5203l = c5203l2;
            this = c10539l;
        }
        try {
            C1121l c1121l = new C1121l(this, this.yandex.f11279l.mo668l(str));
            try {
                Object objInvoke = function1.invoke(c1121l);
                AbstractC1214l.yandex(c1121l, null);
                c5203l.billing(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1214l.yandex(c1121l, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            c5203l.billing(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object mopub(EnumC18674l enumC18674l, Function2 function2, AbstractC0283l abstractC0283l) throws Throwable {
        C9113l c9113l;
        C10539l c10539l;
        int i;
        SQLException e;
        Throwable th;
        boolean z;
        if (abstractC0283l instanceof C9113l) {
            c9113l = (C9113l) abstractC0283l;
            int i2 = c9113l.f18717l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9113l.f18717l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9113l = new C9113l(this, abstractC0283l);
            }
        } else {
            c9113l = new C9113l(this, abstractC0283l);
        }
        Object objInvoke = c9113l.f18713l;
        int i3 = c9113l.f18717l;
        byte b = 0;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i3 == 0) {
                AbstractC2829l.crashlytics(objInvoke);
                if (enumC18674l == null) {
                    enumC18674l = EnumC18674l.f36443l;
                }
                c9113l.f18716l = this;
                c9113l.f18715l = (Serializable) function2;
                c9113l.f18717l = 1;
                if (purchase(enumC18674l, c9113l) != enumC9342l) {
                }
                return enumC9342l;
            }
            if (i3 == 1) {
                function2 = (Function2) c9113l.f18715l;
                this = (C10539l) c9113l.f18716l;
                AbstractC2829l.crashlytics(objInvoke);
            } else {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        Object obj = c9113l.f18716l;
                        AbstractC2829l.crashlytics(objInvoke);
                        return obj;
                    }
                    if (i3 != 5) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) c9113l.f18715l;
                    th = (Throwable) c9113l.f18716l;
                    try {
                        AbstractC2829l.crashlytics(objInvoke);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        AbstractC11718l.yandex(th, e);
                        throw th;
                    }
                }
                i = c9113l.f18718l;
                c10539l = (C10539l) c9113l.f18716l;
                try {
                    AbstractC2829l.crashlytics(objInvoke);
                    z = i != 0;
                    c9113l.f18716l = objInvoke;
                    c9113l.f18717l = 3;
                    if (c10539l.billing(z, c9113l) != enumC9342l) {
                        return enumC9342l;
                    }
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    this = c10539l;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        try {
                            c9113l.f18716l = th;
                            c9113l.f18715l = th3;
                            c9113l.f18717l = 5;
                            if (this.billing(false, c9113l) != enumC9342l) {
                                throw th3;
                            }
                        } catch (SQLException e3) {
                            e = e3;
                            th = th3;
                            if (th != null) {
                                throw e;
                            }
                            AbstractC11718l.yandex(th, e);
                            throw th;
                        }
                    }
                }
            }
            C10595l c10595l = new C10595l(b == true ? 1 : 0, this);
            c9113l.f18716l = this;
            c9113l.f18715l = null;
            c9113l.f18718l = 1;
            c9113l.f18717l = 2;
            objInvoke = function2.invoke(c10595l, c9113l);
            if (objInvoke != enumC9342l) {
                c10539l = this;
                i = 1;
                if (i != 0) {
                }
                c9113l.f18716l = objInvoke;
                c9113l.f18717l = 3;
                if (c10539l.billing(z, c9113l) != enumC9342l) {
                    return objInvoke;
                }
            }
            return enumC9342l;
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object purchase(EnumC18674l enumC18674l, AbstractC0283l abstractC0283l) {
        C9581l c9581l;
        C5203l c5203l;
        if (abstractC0283l instanceof C9581l) {
            c9581l = (C9581l) abstractC0283l;
            int i = c9581l.f19522l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9581l.f19522l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9581l = new C9581l(this, abstractC0283l);
            }
        } else {
            c9581l = new C9581l(this, abstractC0283l);
        }
        Object obj = c9581l.f19518l;
        int i2 = c9581l.f19522l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c9581l.f19521l = this;
            c9581l.f19520l = enumC18674l;
            c5203l = this.yandex;
            c9581l.f19523l = c5203l;
            c9581l.f19522l = 1;
            Object objYandex = c5203l.f11278l.yandex(c9581l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C5203l c5203l2 = c9581l.f19523l;
            enumC18674l = c9581l.f19520l;
            C10539l c10539l = c9581l.f19521l;
            AbstractC2829l.crashlytics(obj);
            c5203l = c5203l2;
            this = c10539l;
        }
        try {
            C11315l c11315l = this.crashlytics;
            C5203l c5203l3 = this.yandex;
            int i3 = c11315l.f22809l;
            if (c11315l.isEmpty()) {
                int iOrdinal = enumC18674l.ordinal();
                if (iOrdinal == 0) {
                    AbstractC13628l.amazon(c5203l3, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    AbstractC13628l.amazon(c5203l3, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new C6451l(11);
                    }
                    AbstractC13628l.amazon(c5203l3, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                AbstractC13628l.amazon(c5203l3, "SAVEPOINT '" + i3 + '\'');
            }
            c11315l.addLast(new C1420l(i3));
            Unit unit = Unit.INSTANCE;
            c5203l.billing(null);
            return unit;
        } catch (Throwable th) {
            c5203l.billing(null);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC12352l
    public final Object yandex(EnumC18674l enumC18674l, Function2 function2, AbstractC5563l abstractC5563l) {
        if (this.amazon.get()) {
            AbstractC13628l.smaato(21, "Connection is recycled");
            throw null;
        }
        C11008l c11008l = (C11008l) abstractC5563l.f1295l.mo245l(C11008l.f22177l);
        if (c11008l != null && c11008l.f22178l == this) {
            return mopub(enumC18674l, function2, abstractC5563l);
        }
        AbstractC13628l.smaato(21, "Attempted to use connection on a different coroutine");
        throw null;
    }
}
