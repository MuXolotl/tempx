package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15003l extends C1538l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ EnumC14530l f29510l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f29511l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15003l(EnumC14530l enumC14530l, InterfaceC8714l interfaceC8714l) {
        super(1, AbstractC6791l.class, "switch", "Content$lambda$11$lambda$10$lambda$9$lambda$8$switch(Lua/itaysonlab/vkxreborn/toggles/types/BooleanToggle;Landroidx/compose/runtime/MutableState;Z)V", 0);
        this.f29510l = enumC14530l;
        this.f29511l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        InterfaceC8714l interfaceC8714l = this.f29511l;
        interfaceC8714l.setValue(bool);
        SharedPreferences sharedPreferences = AbstractC3630l.yandex;
        Boolean bool2 = (Boolean) interfaceC8714l.getValue();
        boolean zBooleanValue = bool2.booleanValue();
        SharedPreferences.Editor editorEdit = AbstractC3630l.yandex.edit();
        EnumC14530l enumC14530l = this.f29510l;
        editorEdit.putBoolean(enumC14530l.name(), zBooleanValue).apply();
        AbstractC3630l.loadAd.put(enumC14530l, bool2);
        return Unit.INSTANCE;
    }
}
