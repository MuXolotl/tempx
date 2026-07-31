package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: lؚٟؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7067l extends AbstractC7095l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f14807l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14808l;

    public /* synthetic */ C7067l(int i, Object obj) {
        this.f14808l = i;
        this.f14807l = obj;
    }

    public C1204l ad(int i) {
        Matcher matcher = ((C0711l) this.f14807l).yandex;
        C8934l c8934lAdcel = AbstractC8576l.adcel(matcher.start(i), matcher.end(i));
        if (c8934lAdcel.f15488l >= 0) {
            return new C1204l(matcher.group(i), c8934lAdcel);
        }
        return null;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f14808l) {
            case 0:
                if (obj == null ? true : obj instanceof C1204l) {
                    return super.contains((C1204l) obj);
                }
                return false;
            default:
                return ((C7090l) this.f14807l).containsValue(obj);
        }
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection
    public boolean isEmpty() {
        switch (this.f14808l) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f14808l) {
            case 0:
                return new C18343l(new C11100l(new C17798l(1, AbstractC14055l.firebase(this)), new C8250l(3, this)));
            default:
                C7250l c7250l = ((C7090l) this.f14807l).f14858l;
                AbstractC15674l[] abstractC15674lArr = new AbstractC15674l[8];
                for (int i = 0; i < 8; i++) {
                    abstractC15674lArr[i] = new C15418l(2);
                }
                return new C16368l(c7250l, abstractC15674lArr);
        }
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        int i = this.f14808l;
        Object obj = this.f14807l;
        switch (i) {
            case 0:
                return ((C0711l) obj).yandex.groupCount() + 1;
            default:
                C7090l c7090l = (C7090l) obj;
                c7090l.getClass();
                return c7090l.f14857l;
        }
    }
}
