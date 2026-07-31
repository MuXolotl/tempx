package androidx.car.app.model;

import defpackage.AbstractC5020l;
import defpackage.AbstractC8586l;
import defpackage.C8339l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC6511l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class Action {
    public static final int FLAG_DEFAULT = 4;
    public static final int FLAG_IS_PERSISTENT = 2;
    public static final int FLAG_PRIMARY = 1;
    public static final int TYPE_CUSTOM = 1;
    static final int TYPE_STANDARD = 65536;
    private final CarColor mBackgroundColor;
    private final int mFlags;
    private final CarIcon mIcon;
    private final boolean mIsEnabled;
    private final InterfaceC6511l mOnClickDelegate;
    private final CarText mTitle;
    private final int mType;
    public static final int TYPE_APP_ICON = 65538;
    public static final Action APP_ICON = new Action(TYPE_APP_ICON);
    public static final int TYPE_COMPOSE_MESSAGE = 65541;
    public static final Action COMPOSE_MESSAGE = new Action(TYPE_COMPOSE_MESSAGE);
    public static final int TYPE_BACK = 65539;
    public static final Action BACK = new Action(TYPE_BACK);
    public static final int TYPE_PAN = 65540;
    public static final Action PAN = new Action(TYPE_PAN);
    public static final int TYPE_MEDIA_PLAYBACK = 65542;
    public static final Action MEDIA_PLAYBACK = new Action(TYPE_MEDIA_PLAYBACK);

    private Action(int i) {
        if (i == 1) {
            C8339l.metrica("Standard action constructor used with non standard type");
            throw null;
        }
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = i;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    public static boolean isStandardActionType(int i) {
        return (i & TYPE_STANDARD) != 0;
    }

    public static String typeToString(int i) {
        if (i == 1) {
            return "CUSTOM";
        }
        switch (i) {
            case TYPE_APP_ICON /* 65538 */:
                return "APP_ICON";
            case TYPE_BACK /* 65539 */:
                return "BACK";
            case TYPE_PAN /* 65540 */:
                return "PAN";
            case TYPE_COMPOSE_MESSAGE /* 65541 */:
                return "COMPOSE_MESSAGE";
            case TYPE_MEDIA_PLAYBACK /* 65542 */:
                return "MEDIA_PLAYBACK";
            default:
                return "<unknown>";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        if (Objects.equals(this.mTitle, action.mTitle) && this.mType == action.mType && Objects.equals(this.mIcon, action.mIcon)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(action.mOnClickDelegate == null)) && Integer.valueOf(this.mFlags).equals(Integer.valueOf(action.mFlags)) && this.mIsEnabled == action.mIsEnabled) {
                return true;
            }
        }
        return false;
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public InterfaceC6511l getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Integer.valueOf(this.mType), Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(this.mIcon == null), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isStandard() {
        return isStandardActionType(this.mType);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(typeToString(this.mType));
        sb.append(", icon: ");
        sb.append(this.mIcon);
        sb.append(", bkg: ");
        sb.append(this.mBackgroundColor);
        sb.append(", isEnabled: ");
        return AbstractC5020l.Signature(sb, this.mIsEnabled, "]");
    }

    public Action(AbstractC8586l abstractC8586l) {
        throw null;
    }

    private Action() {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = 1;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }
}
