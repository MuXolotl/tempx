package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.AbstractC18154l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC2481l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class MessageInfo implements InterfaceC2481l {
    private final CarIcon mImage;
    private final CarText mText;
    private final CarText mTitle;

    private MessageInfo() {
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return Objects.equals(this.mTitle, messageInfo.mTitle) && Objects.equals(this.mText, messageInfo.mText) && Objects.equals(this.mImage, messageInfo.mImage);
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mImage);
    }

    public String toString() {
        return "MessageInfo";
    }

    public MessageInfo(AbstractC18154l abstractC18154l) {
        throw null;
    }
}
