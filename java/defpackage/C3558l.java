package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.io.Serializable;
import java.security.SecureRandom;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;
import java.util.Arrays;

/* JADX INFO: renamed from: lؕۖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3558l implements InterfaceC5788l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f7483l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Serializable f7484l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f7485l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f7486l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f7487l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f7488l;

    public C3558l(InterfaceC5788l interfaceC5788l) {
        this.f7485l = interfaceC5788l;
        this.f7486l = AbstractC8151l.amazon("org.bouncycastle.pkcs1.not_strict", true) ? false : !AbstractC8151l.amazon("org.bouncycastle.pkcs1.strict", false);
    }

    public void crashlytics(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f7488l;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC14657l.remoteconfig;
        C12418l c12418lPro = C12418l.pro(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        AbstractC15872l.remoteconfig(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c12418lPro.f24518l, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC13273l.loadAd(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC13273l.loadAd(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC13273l.loadAd(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c12418lPro.adcel(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC2341l.crashlytics(typedArray.getInt(3, -1), null));
            }
        } finally {
            c12418lPro.advert();
        }
    }

    @Override // defpackage.InterfaceC5788l
    public int getInputBlockSize() {
        int inputBlockSize = ((InterfaceC5788l) this.f7485l).getInputBlockSize();
        return this.f7483l ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // defpackage.InterfaceC5788l
    public int getOutputBlockSize() {
        int outputBlockSize = ((InterfaceC5788l) this.f7485l).getOutputBlockSize();
        return this.f7483l ? outputBlockSize : outputBlockSize - 10;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    @Override // defpackage.InterfaceC5788l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        AbstractC8831l abstractC8831l;
        InterfaceC5788l interfaceC5788l = (InterfaceC5788l) this.f7485l;
        if (interfaceC9719l instanceof C6114l) {
            C6114l c6114l = (C6114l) interfaceC9719l;
            this.f7488l = c6114l.f12904l;
            abstractC8831l = (AbstractC8831l) c6114l.f12903l;
        } else {
            abstractC8831l = (AbstractC8831l) interfaceC9719l;
            if (!abstractC8831l.f18137l && z) {
                this.f7488l = AbstractC8776l.loadAd();
            }
        }
        interfaceC5788l.init(z, interfaceC9719l);
        this.f7487l = abstractC8831l.f18137l;
        this.f7483l = z;
        this.f7484l = new byte[interfaceC5788l.getOutputBlockSize()];
    }

    public void loadAd() {
        C18167l c18167l = (C18167l) this.f7488l;
        Drawable checkMarkDrawable = c18167l.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f7483l || this.f7487l) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f7483l) {
                    drawableMutate.setTintList((ColorStateList) this.f7485l);
                }
                if (this.f7487l) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f7484l);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c18167l.getDrawableState());
                }
                c18167l.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    @Override // defpackage.InterfaceC5788l
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int length;
        boolean z = this.f7483l;
        InterfaceC5788l interfaceC5788l = (InterfaceC5788l) this.f7485l;
        if (z) {
            if (i2 > getInputBlockSize()) {
                C8339l.metrica("input data too large");
                return null;
            }
            int inputBlockSize = interfaceC5788l.getInputBlockSize();
            byte[] bArr2 = new byte[inputBlockSize];
            if (this.f7487l) {
                bArr2[0] = 1;
                for (int i5 = 1; i5 != (inputBlockSize - i2) - 1; i5++) {
                    bArr2[i5] = -1;
                }
            } else {
                ((SecureRandom) this.f7488l).nextBytes(bArr2);
                bArr2[0] = 2;
                for (int i6 = 1; i6 != (inputBlockSize - i2) - 1; i6++) {
                    while (bArr2[i6] == 0) {
                        bArr2[i6] = (byte) ((SecureRandom) this.f7488l).nextInt();
                    }
                }
            }
            int i7 = inputBlockSize - i2;
            bArr2[i7 - 1] = 0;
            System.arraycopy(bArr, i, bArr2, i7, i2);
            return interfaceC5788l.processBlock(bArr2, 0, inputBlockSize);
        }
        int outputBlockSize = interfaceC5788l.getOutputBlockSize();
        byte[] bArrProcessBlock = interfaceC5788l.processBlock(bArr, i, i2);
        boolean z2 = this.f7486l & (bArrProcessBlock.length != outputBlockSize);
        byte[] bArr3 = bArrProcessBlock.length < outputBlockSize ? (byte[]) this.f7484l : bArrProcessBlock;
        if (this.f7487l) {
            int i8 = -((bArr3[0] & 255) ^ 2);
            i3 = 0;
            int i9 = 0;
            for (int i10 = 1; i10 < bArr3.length; i10++) {
                int i11 = ((bArr3[i10] & 255) - 1) >> 31;
                i3 ^= ((~i9) & i10) & i11;
                i9 |= i11;
            }
            i4 = i8 | (i3 - 9);
            length = bArr3.length;
        } else {
            int i12 = -((bArr3[0] & 255) ^ 1);
            i3 = 0;
            int i13 = 0;
            for (int i14 = 1; i14 < bArr3.length; i14++) {
                int i15 = bArr3[i14] & 255;
                int i16 = (i15 - 1) >> 31;
                i3 ^= ((~i13) & i14) & i16;
                i13 |= i16;
                i12 |= ~((((i15 ^ 255) - 1) >> 31) | i13);
            }
            i4 = i12 | (i3 - 9);
            length = bArr3.length;
        }
        int i17 = (i4 >> 31) | ((length - 1) - i3);
        try {
            if (i17 < 0) {
                throw new C10352l("block incorrect");
            }
            if (z2) {
                throw new C10352l("block incorrect size");
            }
            byte[] bArr4 = new byte[i17];
            System.arraycopy(bArr3, bArr3.length - i17, bArr4, 0, i17);
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr5 = (byte[]) this.f7484l;
            Arrays.fill(bArr5, 0, Math.max(0, bArr5.length - bArrProcessBlock.length), (byte) 0);
            return bArr4;
        } catch (Throwable th) {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr6 = (byte[]) this.f7484l;
            Arrays.fill(bArr6, 0, Math.max(0, bArr6.length - bArrProcessBlock.length), (byte) 0);
            throw th;
        }
    }

    public void yandex() {
        CompoundButton compoundButton = (CompoundButton) this.f7488l;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f7483l || this.f7487l) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f7483l) {
                    drawableMutate.setTintList((ColorStateList) this.f7485l);
                }
                if (this.f7487l) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f7484l);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public /* synthetic */ C3558l(TextView textView) {
        this.f7485l = null;
        this.f7484l = null;
        this.f7483l = false;
        this.f7487l = false;
        this.f7488l = textView;
    }

    public C3558l(X509CRLSelector x509CRLSelector) {
        this.f7483l = false;
        this.f7487l = false;
        this.f7485l = null;
        this.f7484l = null;
        this.f7486l = false;
        this.f7488l = (CRLSelector) x509CRLSelector.clone();
    }
}
