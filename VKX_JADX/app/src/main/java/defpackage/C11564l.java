package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lِؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11564l implements InterfaceC2810l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11564l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC2810l
    public final void yandex(Object obj) {
        HashMap map;
        int i = this.yandex;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                ((C9038l) obj2).subs(obj);
                return;
            case 1:
                C18449l c18449l = (C18449l) obj2;
                C9337l c9337l = (C9337l) obj;
                synchronized (((HashMap) c18449l.f36009l)) {
                    map = new HashMap((HashMap) c18449l.f36009l);
                    break;
                }
                for (Map.Entry entry : map.entrySet()) {
                    ((Executor) entry.getValue()).execute(new RunnableC12388l(entry, c9337l, 5));
                }
                return;
            default:
                ((C8250l) obj2).invoke(obj);
                return;
        }
    }
}
