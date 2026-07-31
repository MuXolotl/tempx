package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15112l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC14080l f29645l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC3031l f29646l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1424l f29647l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f29648l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f29649l;

    public C15112l(C1424l c1424l, AbstractC3031l abstractC3031l, AbstractC14080l abstractC14080l, int i, int i2) {
        this.f29647l = c1424l;
        this.f29646l = abstractC3031l;
        this.f29645l = abstractC14080l;
        this.f29649l = i;
        this.f29648l = i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int size;
        AbstractC14080l abstractC14080l = this.f29645l;
        boolean z = abstractC14080l instanceof C14036l;
        int i = 0;
        if (z) {
            size = ((C14036l) abstractC14080l).f27369l.size();
        } else {
            size = abstractC14080l instanceof C13146l ? ((C13146l) abstractC14080l).f25729l.size() : 0;
        }
        AbstractC3031l abstractC3031l = this.f29646l;
        if (z) {
            int i2 = ((C14036l) abstractC14080l).f27358l;
            if ((i2 & 32) == 32 || (i2 & 64) == 64) {
                i = 1;
            }
        } else if (abstractC14080l instanceof C13146l) {
            int i3 = ((C13146l) abstractC14080l).f25716l;
            if ((i3 & 32) == 32 || (i3 & 64) == 64) {
                i = 1;
            }
        } else {
            if (!(abstractC14080l instanceof C13347l)) {
                throw new UnsupportedOperationException("Unsupported message: " + abstractC14080l.getClass());
            }
            C15627l c15627l = (C15627l) abstractC3031l;
            if (c15627l.f30550l == EnumC16667l.ENUM_CLASS) {
                i = 2;
            } else if (c15627l.f30552l) {
                i = 1;
            }
        }
        return this.f29647l.m912implements(abstractC3031l, abstractC14080l, this.f29649l, size + i + this.f29648l);
    }
}
