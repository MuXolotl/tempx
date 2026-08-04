package defpackage;

import java.util.UUID;

/* JADX INFO: renamed from: lٖٓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16374l extends AbstractC17970l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC15076l f32020l;

    public AbstractC16374l(String str, AbstractC17970l abstractC17970l, AbstractC15076l abstractC15076l, C9226l c9226l) {
        super(str, abstractC17970l, c9226l);
        AbstractC12442l.admob(abstractC15076l.crashlytics);
        this.f32020l = abstractC15076l;
    }

    @Override // defpackage.InterfaceC14094l
    public final AbstractC15076l admob() {
        return AbstractC15076l.yandex(this.f32020l, remoteconfig());
    }

    public AbstractC16374l(String str, UUID uuid, String str2, AbstractC15076l abstractC15076l, C9226l c9226l) {
        super(str, uuid, str2, c9226l);
        AbstractC12442l.admob(abstractC15076l.crashlytics);
        this.f32020l = abstractC15076l;
    }
}
