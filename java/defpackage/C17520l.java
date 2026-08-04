package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٜٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17520l extends AbstractC15396l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f34140l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17520l(int i, int i2) {
        super(i);
        this.f34140l = i2;
    }

    @Override // defpackage.AbstractC15396l
    public final Object billing() {
        switch (this.f34140l) {
            case 0:
                return new byte[4096];
            case 1:
                return new char[2048];
            case 2:
                C4540l c4540l = new C4540l();
                c4540l.yandex = new ArrayList();
                return c4540l;
            default:
                int[] iArr = new int[768];
                for (int i = 0; i < 768; i++) {
                    iArr[i] = -1;
                }
                return iArr;
        }
    }

    @Override // defpackage.AbstractC15396l
    public Object yandex(Object obj) {
        switch (this.f34140l) {
            case 2:
                C4540l c4540l = (C4540l) obj;
                ArrayList arrayList = c4540l.yandex;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC11066l.yandex.mo2251l((int[]) it.next());
                }
                arrayList.clear();
                return c4540l;
            case 3:
                int[] iArr = (int[]) obj;
                AbstractC8669l.m2411package(-1, 0, 6, iArr);
                return iArr;
            default:
                return obj;
        }
    }
}
