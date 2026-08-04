package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lٌٌۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9116l extends AbstractC13455l implements InterfaceC5598l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C7090l f18724l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18725l;

    public /* synthetic */ C9116l(C7090l c7090l, int i) {
        this.f18725l = i;
        this.f18724l = c7090l;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.f18725l;
        C7090l c7090l = this.f18724l;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = c7090l.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && c7090l.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return c7090l.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f18725l) {
            case 0:
                C7250l c7250l = this.f18724l.f14858l;
                AbstractC15674l[] abstractC15674lArr = new AbstractC15674l[8];
                for (int i = 0; i < 8; i++) {
                    abstractC15674lArr[i] = new C15418l(0);
                }
                return new C16368l(c7250l, abstractC15674lArr);
            default:
                C7250l c7250l2 = this.f18724l.f14858l;
                AbstractC15674l[] abstractC15674lArr2 = new AbstractC15674l[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    abstractC15674lArr2[i2] = new C15418l(1);
                }
                return new C16368l(c7250l2, abstractC15674lArr2);
        }
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        int i = this.f18725l;
        C7090l c7090l = this.f18724l;
        switch (i) {
            case 0:
                c7090l.getClass();
                break;
            default:
                c7090l.getClass();
                break;
        }
        return c7090l.f14857l;
    }
}
