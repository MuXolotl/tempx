package defpackage;

import java.lang.reflect.Field;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚؓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6991l extends AbstractC3432l implements InterfaceC13468l {
    public final Object mopub;

    public C6991l(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.mopub = obj;
    }

    @Override // defpackage.AbstractC3432l, defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) throws IllegalAccessException {
        purchase(objArr);
        ((Field) this.yandex).set(this.mopub, AbstractC8669l.m2409native(objArr));
        return Unit.INSTANCE;
    }
}
