package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lِٖٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16545l extends C0065l {
    public final List firebase;
    public final C18010l isPro;
    public int remoteconfig;
    public final int smaato;

    public C16545l(AbstractC8237l abstractC8237l, C18010l c18010l) {
        super(abstractC8237l, c18010l, (String) null, 12);
        this.isPro = c18010l;
        List listM4213const = AbstractC16901l.m4213const(c18010l.f35200l.keySet());
        this.firebase = listM4213const;
        this.smaato = listM4213const.size() * 2;
        this.remoteconfig = -1;
    }

    @Override // defpackage.C0065l, defpackage.InterfaceC14988l
    public final int admob(InterfaceC18035l interfaceC18035l) {
        int i = this.remoteconfig;
        if (i >= this.smaato - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.remoteconfig = i2;
        return i2;
    }

    @Override // defpackage.C0065l, defpackage.AbstractC16370l
    /* JADX INFO: renamed from: class */
    public final AbstractC9914l mo264class() {
        return this.isPro;
    }

    @Override // defpackage.C0065l
    /* JADX INFO: renamed from: new */
    public final C18010l mo264class() {
        return this.isPro;
    }

    @Override // defpackage.C0065l, defpackage.AbstractC16370l
    /* JADX INFO: renamed from: package */
    public final AbstractC9914l mo267package(String str) {
        return this.remoteconfig % 2 == 0 ? AbstractC8358l.loadAd(str) : (AbstractC9914l) AbstractC8676l.smaato(str, this.isPro);
    }

    @Override // defpackage.C0065l, defpackage.AbstractC16370l
    /* JADX INFO: renamed from: switch */
    public final String mo268switch(InterfaceC18035l interfaceC18035l, int i) {
        return (String) this.firebase.get(i / 2);
    }

    @Override // defpackage.C0065l, defpackage.AbstractC16370l, defpackage.InterfaceC14988l
    public final void yandex(InterfaceC18035l interfaceC18035l) {
    }
}
