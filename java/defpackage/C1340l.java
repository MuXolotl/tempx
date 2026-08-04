package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌؒۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1340l extends C1904l implements InterfaceC12316l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.InterfaceC12316l
    public final Object loadAd(InterfaceC14029l interfaceC14029l, Object obj) throws Exception {
        C12794l c12794l;
        C13007l c13007lMo695switch;
        C13007l c13007l;
        Throwable th;
        C7167l c7167l;
        C13007l c13007l2;
        Throwable th2;
        if (interfaceC14029l instanceof C12794l) {
            c12794l = (C12794l) interfaceC14029l;
            int i = c12794l.f25169l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12794l.f25169l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12794l = new C12794l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c12794l = new C12794l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object obj2 = c12794l.f25165l;
        int i2 = c12794l.f25169l;
        C14025l c14025l = this.loadAd;
        Throwable th3 = null;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj2);
                if (((AtomicBoolean) this.amazon.f16631l).get()) {
                    C8339l.smaato("This scope has already been closed.");
                    return null;
                }
                c13007lMo695switch = this.yandex.mo695switch(c14025l);
                try {
                    C7167l c7167l2 = new C7167l(C13007l.yandex(c13007lMo695switch));
                    try {
                        C15053l c15053l = this.crashlytics;
                        c12794l.f25168l = c13007lMo695switch;
                        c12794l.f25167l = c13007lMo695switch;
                        c12794l.f25170l = c7167l2;
                        c12794l.f25169l = 1;
                        Unit unitMo2332l = ((InterfaceC18477l) c15053l.f29576l).mo2332l(new C16145l(c7167l2), obj);
                        EnumC9342l enumC9342l = EnumC9342l.f19165l;
                        if (unitMo2332l != enumC9342l) {
                            unitMo2332l = Unit.INSTANCE;
                        }
                        if (unitMo2332l == enumC9342l) {
                            return enumC9342l;
                        }
                        c13007l2 = c13007lMo695switch;
                        c13007l = c13007l2;
                        c7167l = c7167l2;
                    } catch (Throwable th4) {
                        c13007l = c13007lMo695switch;
                        th = th4;
                        c7167l = c7167l2;
                        if (c7167l != null) {
                            c7167l.close();
                        }
                        th2 = th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (c13007lMo695switch != null) {
                        c13007lMo695switch.close();
                    }
                    th3 = th;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c7167l = c12794l.f25170l;
                c13007l2 = c12794l.f25167l;
                c13007l = c12794l.f25168l;
                try {
                    AbstractC2829l.crashlytics(obj2);
                } catch (Throwable th6) {
                    th = th6;
                    if (c7167l != null) {
                        try {
                            c7167l.close();
                        } catch (Throwable th7) {
                            try {
                                AbstractC11718l.yandex(th, th7);
                            } catch (Throwable th8) {
                                th = th8;
                                c13007lMo695switch = c13007l;
                                if (c13007lMo695switch != null) {
                                    try {
                                        c13007lMo695switch.close();
                                    } catch (Throwable th9) {
                                        AbstractC11718l.yandex(th, th9);
                                    }
                                }
                                th3 = th;
                            }
                        }
                    }
                    th2 = th;
                }
            }
            c13007l2.flush();
            Unit unit = Unit.INSTANCE;
            if (c7167l != null) {
                try {
                    c7167l.close();
                } catch (Throwable th10) {
                    th2 = th10;
                }
            }
            th2 = null;
            C13007l c13007l3 = c13007l;
            if (th2 != null) {
                throw th2;
            }
            Unit unit2 = Unit.INSTANCE;
            if (c13007l3 != null) {
                try {
                    c13007l3.close();
                } catch (Throwable th11) {
                    th3 = th11;
                }
            }
            if (th3 == null) {
                return Unit.INSTANCE;
            }
            throw th3;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw AbstractC11020l.crashlytics(String.valueOf(c14025l.crashlytics()), (FileNotFoundException) e);
            }
            throw e;
        }
    }
}
