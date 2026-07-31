package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lَؚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6986l implements InterfaceC18108l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f14654l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14655l;

    public /* synthetic */ C6986l(int i, Object obj) {
        this.f14655l = i;
        this.f14654l = obj;
    }

    @Override // defpackage.InterfaceC18108l
    public final void yandex(AbstractC12655l abstractC12655l) {
        C11108l c11108l;
        int i = this.f14655l;
        Object obj = this.f14654l;
        switch (i) {
            case 0:
                C15629l c15629l = (C15629l) ((WeakReference) ((C1282l) obj).f3331l).get();
                if (c15629l != null) {
                    c15629l.f30554l.execute(new RunnableC11297l(11, c15629l));
                    return;
                }
                return;
            default:
                C6344l c6344l = (C6344l) obj;
                synchronized (c6344l.f13303l) {
                    try {
                        int i2 = c6344l.f13305l - 1;
                        c6344l.f13305l = i2;
                        if (c6344l.f13306l && i2 == 0) {
                            c6344l.close();
                        }
                        c11108l = (C11108l) c6344l.f13309l;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (c11108l != null) {
                    c11108l.yandex(abstractC12655l);
                    return;
                }
                return;
        }
    }
}
