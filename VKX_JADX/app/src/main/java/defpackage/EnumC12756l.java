package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lّٟٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12756l {
    private static final /* synthetic */ InterfaceC5319l $ENTRIES;
    private static final /* synthetic */ EnumC12756l[] $VALUES;

    @InterfaceC9347l(name = "audiobooks")
    public static final EnumC12756l AUDIOBOOKS;

    @InterfaceC9347l(name = "podcasts")
    public static final EnumC12756l PODCASTS;

    static {
        EnumC12756l enumC12756l = new EnumC12756l("PODCASTS", 0);
        PODCASTS = enumC12756l;
        EnumC12756l enumC12756l2 = new EnumC12756l("AUDIOBOOKS", 1);
        AUDIOBOOKS = enumC12756l2;
        EnumC12756l[] enumC12756lArr = {enumC12756l, enumC12756l2};
        $VALUES = enumC12756lArr;
        $ENTRIES = new C14092l(enumC12756lArr);
    }

    public static EnumC12756l valueOf(String str) {
        return (EnumC12756l) Enum.valueOf(EnumC12756l.class, str);
    }

    public static EnumC12756l[] values() {
        return (EnumC12756l[]) $VALUES.clone();
    }
}
