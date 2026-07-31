package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْ۠۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13722l extends C2998l implements Function0 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ EnumC14530l f26774l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f26775l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13722l(EnumC14530l enumC14530l, InterfaceC8714l interfaceC8714l) {
        super(0, AbstractC6791l.class, "switch", "Content$lambda$11$lambda$10$lambda$9$lambda$8$switch(Lua/itaysonlab/vkxreborn/toggles/types/BooleanToggle;Landroidx/compose/runtime/MutableState;Z)V", 0);
        this.f26774l = enumC14530l;
        this.f26775l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC8714l interfaceC8714l = this.f26775l;
        interfaceC8714l.setValue(Boolean.valueOf(!((Boolean) interfaceC8714l.getValue()).booleanValue()));
        SharedPreferences sharedPreferences = AbstractC3630l.yandex;
        Boolean bool = (Boolean) interfaceC8714l.getValue();
        boolean zBooleanValue = bool.booleanValue();
        SharedPreferences.Editor editorEdit = AbstractC3630l.yandex.edit();
        EnumC14530l enumC14530l = this.f26774l;
        editorEdit.putBoolean(enumC14530l.name(), zBooleanValue).apply();
        AbstractC3630l.loadAd.put(enumC14530l, bool);
        return Unit.INSTANCE;
    }
}
