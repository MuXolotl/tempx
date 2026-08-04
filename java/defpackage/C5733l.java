package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5733l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C9847l f12111l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12112l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5733l(C9847l c9847l, int i) {
        super(1);
        this.f12112l = i;
        this.f12111l = c9847l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f12112l;
        C9847l c9847l = this.f12111l;
        switch (i) {
            case 0:
                C4398l c4398l = (C4398l) obj;
                AbstractC14971l abstractC14971lLoadAd = c9847l.f29454l;
                C17893l c17893l = null;
                while (abstractC14971lLoadAd != null) {
                    if (abstractC14971lLoadAd instanceof C6543l) {
                        if (AbstractC6745l.admob((C6543l) abstractC14971lLoadAd)) {
                        }
                        break;
                    } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                        int i2 = 0;
                        for (AbstractC14971l abstractC14971l = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
                            if ((abstractC14971l.f29450l & 1024) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    abstractC14971lLoadAd = abstractC14971l;
                                } else {
                                    if (c17893l == null) {
                                        c17893l = new C17893l(0, new AbstractC14971l[16]);
                                    }
                                    if (abstractC14971lLoadAd != null) {
                                        c17893l.crashlytics(abstractC14971lLoadAd);
                                        abstractC14971lLoadAd = null;
                                    }
                                    c17893l.crashlytics(abstractC14971l);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                }
                if (!c9847l.f29454l.f29462l) {
                    AbstractC0081l.crashlytics("visitChildren called on an unattached node");
                }
                C17893l c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                AbstractC14971l abstractC14971l2 = c9847l.f29454l;
                AbstractC14971l abstractC14971l3 = abstractC14971l2.f29460l;
                if (abstractC14971l3 == null) {
                    AbstractC5573l.yandex(c17893l2, abstractC14971l2);
                } else {
                    c17893l2.crashlytics(abstractC14971l3);
                }
                while (true) {
                    int i3 = c17893l2.f34846l;
                    if (i3 != 0) {
                        AbstractC14971l abstractC14971lLoadAd2 = (AbstractC14971l) c17893l2.vip(i3 - 1);
                        if ((abstractC14971lLoadAd2.f29457l & 1024) == 0) {
                            AbstractC5573l.yandex(c17893l2, abstractC14971lLoadAd2);
                        } else {
                            while (abstractC14971lLoadAd2 != null) {
                                if ((abstractC14971lLoadAd2.f29450l & 1024) != 0) {
                                    C17893l c17893l3 = null;
                                    while (abstractC14971lLoadAd2 != null) {
                                        if (abstractC14971lLoadAd2 instanceof C6543l) {
                                            if (AbstractC6745l.admob((C6543l) abstractC14971lLoadAd2)) {
                                            }
                                        } else if ((abstractC14971lLoadAd2.f29450l & 1024) != 0 && (abstractC14971lLoadAd2 instanceof AbstractC11340l)) {
                                            int i4 = 0;
                                            for (AbstractC14971l abstractC14971l4 = ((AbstractC11340l) abstractC14971lLoadAd2).f22875l; abstractC14971l4 != null; abstractC14971l4 = abstractC14971l4.f29460l) {
                                                if ((abstractC14971l4.f29450l & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        abstractC14971lLoadAd2 = abstractC14971l4;
                                                    } else {
                                                        if (c17893l3 == null) {
                                                            c17893l3 = new C17893l(0, new AbstractC14971l[16]);
                                                        }
                                                        if (abstractC14971lLoadAd2 != null) {
                                                            c17893l3.crashlytics(abstractC14971lLoadAd2);
                                                            abstractC14971lLoadAd2 = null;
                                                        }
                                                        c17893l3.crashlytics(abstractC14971l4);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        abstractC14971lLoadAd2 = AbstractC5573l.loadAd(c17893l3);
                                    }
                                }
                                abstractC14971lLoadAd2 = abstractC14971lLoadAd2.f29460l;
                            }
                        }
                        break;
                    } else if (!AbstractC8576l.yandex(c9847l.f20044l, C6523l.loadAd)) {
                        if (AbstractC8576l.yandex(c9847l.f20044l, C6523l.crashlytics)) {
                            c4398l.loadAd = true;
                        } else {
                            C6523l.loadAd(c9847l.f20044l);
                        }
                    }
                }
                break;
            default:
                AbstractC4071l.amazon(c9847l);
                break;
        }
        return Unit.INSTANCE;
    }
}
