package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lُٔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC14812l {
    private static final /* synthetic */ InterfaceC5319l $ENTRIES;
    private static final /* synthetic */ EnumC14812l[] $VALUES;
    public static final C16659l Companion;
    public static final EnumC14812l ON_ANY;
    public static final EnumC14812l ON_CREATE;
    public static final EnumC14812l ON_DESTROY;
    public static final EnumC14812l ON_PAUSE;
    public static final EnumC14812l ON_RESUME;
    public static final EnumC14812l ON_START;
    public static final EnumC14812l ON_STOP;

    static {
        EnumC14812l enumC14812l = new EnumC14812l("ON_CREATE", 0);
        ON_CREATE = enumC14812l;
        EnumC14812l enumC14812l2 = new EnumC14812l("ON_START", 1);
        ON_START = enumC14812l2;
        EnumC14812l enumC14812l3 = new EnumC14812l("ON_RESUME", 2);
        ON_RESUME = enumC14812l3;
        EnumC14812l enumC14812l4 = new EnumC14812l("ON_PAUSE", 3);
        ON_PAUSE = enumC14812l4;
        EnumC14812l enumC14812l5 = new EnumC14812l("ON_STOP", 4);
        ON_STOP = enumC14812l5;
        EnumC14812l enumC14812l6 = new EnumC14812l("ON_DESTROY", 5);
        ON_DESTROY = enumC14812l6;
        EnumC14812l enumC14812l7 = new EnumC14812l("ON_ANY", 6);
        ON_ANY = enumC14812l7;
        EnumC14812l[] enumC14812lArr = {enumC14812l, enumC14812l2, enumC14812l3, enumC14812l4, enumC14812l5, enumC14812l6, enumC14812l7};
        $VALUES = enumC14812lArr;
        $ENTRIES = new C14092l(enumC14812lArr);
        Companion = new C16659l();
    }

    public static EnumC14812l valueOf(String str) {
        return (EnumC14812l) Enum.valueOf(EnumC14812l.class, str);
    }

    public static EnumC14812l[] values() {
        return (EnumC14812l[]) $VALUES.clone();
    }

    public final EnumC8981l yandex() {
        switch (AbstractC15462l.yandex[ordinal()]) {
            case 1:
            case 2:
                return EnumC8981l.f18520l;
            case 3:
            case 4:
                return EnumC8981l.f18524l;
            case 5:
                return EnumC8981l.f18523l;
            case 6:
                return EnumC8981l.f18522l;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                C18725l.billing();
                return null;
        }
    }
}
