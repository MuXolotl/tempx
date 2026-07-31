package defpackage;

import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lۣؗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5245l extends AbstractC8284l {

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final String f11324l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public final int f11325l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final Integer f11326l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5245l(Integer num, String str) {
        super(VKXApplication.Companion.loadAd(R.string.tab_popular), C6371l.yandex);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.f11326l = num;
        this.f11324l = str;
        this.f11325l = 400;
    }

    @Override // defpackage.AbstractC8284l, defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    public final Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        return AbstractC8189l.admob(new C16534l(i, this.f11325l, this.f11326l), interfaceC14029l);
    }

    @Override // defpackage.AbstractC8284l
    /* JADX INFO: renamed from: const */
    public final boolean mo851const() {
        return true;
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: final */
    public final void mo852final() {
        String str = this.f11324l;
        if (str != null) {
            AbstractC14412l abstractC14412l = this.f5279l;
            if (abstractC14412l == null) {
                abstractC14412l = null;
            }
            C5447l c5447l = ((C3497l) abstractC14412l).admob;
            if (c5447l != null) {
                c5447l.setSubtitle(str);
            }
        }
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: goto */
    public final int mo853goto() {
        return this.f11325l;
    }

    @Override // defpackage.AbstractC8284l, defpackage.AbstractC11519l
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final C14451l mo1270new() {
        C14451l c14451l = new C14451l(false, false, 0, this.f17178l, new C4936l(0, this, C5245l.class, "getCustomMenuItem", "getCustomMenuItem()Lkotlin/Pair;", 0, 0, 19), null, 103);
        c14451l.f28311l = new C8854l(c14451l, this, 23);
        return c14451l;
    }
}
