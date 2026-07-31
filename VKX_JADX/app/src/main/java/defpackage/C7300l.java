package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lُؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7300l extends AbstractC12946l {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final C7300l DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_ALPHA_FIELD_NUMBER = 12;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile InterfaceC6634l PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private InterfaceC10996l children_ = C17756l.f34579l;
    private boolean hasAction_;
    private boolean hasImageAlpha_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        C7300l c7300l = new C7300l();
        DEFAULT_INSTANCE = c7300l;
        AbstractC12946l.firebase(C7300l.class, c7300l);
    }

    public static void Signature(C7300l c7300l, boolean z) {
        c7300l.hasAction_ = z;
    }

    public static void ad(C7300l c7300l, boolean z) {
        c7300l.hasImageColorFilter_ = z;
    }

    public static void adcel(C7300l c7300l, EnumC0982l enumC0982l) {
        int i;
        c7300l.getClass();
        if (enumC0982l != EnumC0982l.UNRECOGNIZED) {
            i = enumC0982l.f2708l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c7300l.horizontalAlignment_ = i;
    }

    public static void ads(C7300l c7300l, EnumC17543l enumC17543l) {
        int i;
        c7300l.getClass();
        if (enumC17543l != EnumC17543l.UNRECOGNIZED) {
            i = enumC17543l.f34163l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c7300l.verticalAlignment_ = i;
    }

    public static void advert(C7300l c7300l, boolean z) {
        c7300l.hasImageAlpha_ = z;
    }

    public static C7300l isVip() {
        return DEFAULT_INSTANCE;
    }

    public static void license(C7300l c7300l, ArrayList arrayList) {
        InterfaceC10996l interfaceC10996l = c7300l.children_;
        if (!((AbstractC0853l) interfaceC10996l).f2503l) {
            int size = interfaceC10996l.size();
            c7300l.children_ = interfaceC10996l.yandex(size == 0 ? 10 : size * 2);
        }
        AbstractC9446l.yandex(arrayList, c7300l.children_);
    }

    public static void metrica(C7300l c7300l, EnumC4164l enumC4164l) {
        c7300l.getClass();
        c7300l.width_ = enumC4164l.yandex();
    }

    public static void pro(C7300l c7300l, boolean z) {
        c7300l.hasImageDescription_ = z;
    }

    public static C3611l signatures() {
        return (C3611l) DEFAULT_INSTANCE.crashlytics();
    }

    public static void startapp(C7300l c7300l, EnumC4164l enumC4164l) {
        c7300l.getClass();
        c7300l.height_ = enumC4164l.yandex();
    }

    public static void subscription(C7300l c7300l, EnumC13522l enumC13522l) {
        int i;
        c7300l.getClass();
        if (enumC13522l != EnumC13522l.UNRECOGNIZED) {
            i = enumC13522l.f26541l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c7300l.imageScale_ = i;
    }

    public static void tapsense(C7300l c7300l) {
        int i;
        c7300l.getClass();
        EnumC6866l enumC6866l = EnumC6866l.UNRECOGNIZED;
        EnumC6866l enumC6866l2 = EnumC6866l.BACKGROUND_NODE;
        if (enumC6866l2 != enumC6866l) {
            i = enumC6866l2.f14364l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c7300l.identity_ = i;
    }

    public static void vip(C7300l c7300l, EnumC12675l enumC12675l) {
        int i;
        c7300l.getClass();
        if (enumC12675l != EnumC12675l.UNRECOGNIZED) {
            i = enumC12675l.f24978l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c7300l.type_ = i;
    }

    @Override // defpackage.AbstractC12946l
    public final Object amazon(int i) {
        InterfaceC6634l c1219l;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C15293l(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007\f\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", C7300l.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_", "hasImageAlpha_"});
            case 3:
                return new C7300l();
            case 4:
                return new C3611l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6634l interfaceC6634l = PARSER;
                if (interfaceC6634l != null) {
                    return interfaceC6634l;
                }
                synchronized (C7300l.class) {
                    try {
                        c1219l = PARSER;
                        if (c1219l == null) {
                            c1219l = new C1219l();
                            PARSER = c1219l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1219l;
            default:
                C3010l.mopub();
                return null;
        }
    }
}
