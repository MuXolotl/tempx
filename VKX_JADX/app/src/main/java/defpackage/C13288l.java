package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُِْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13288l extends AbstractC7581l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f26067l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f26068l;

    public /* synthetic */ C13288l(int i, Object obj) {
        this.f26067l = i;
        this.f26068l = obj;
    }

    @Override // defpackage.AbstractC7581l
    public final void isPro(Throwable th) {
        int i = this.f26067l;
        Object obj = this.f26068l;
        switch (i) {
            case 0:
                ((InterfaceC11791l) obj).yandex();
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                C14750l c14750l = this.f15589l;
                if (c14750l == null) {
                    c14750l = null;
                }
                c14750l.getClass();
                Object obj2 = C14750l.f28822l.get(c14750l);
                C15431l c15431l = (C15431l) obj;
                if (!(obj2 instanceof C2175l)) {
                    c15431l.subs(AbstractC7114l.yandex(obj2));
                } else {
                    c15431l.subs(new C18435l(((C2175l) obj2).yandex));
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7581l
    public final boolean subs() {
        switch (this.f26067l) {
        }
        return false;
    }
}
