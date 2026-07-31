package com.skydoves.balloon.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import defpackage.AbstractC15684l;
import defpackage.AbstractC1753l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC4755l;
import defpackage.AbstractC9968l;
import defpackage.C0114l;
import defpackage.C11428l;
import defpackage.C13568l;
import defpackage.C18725l;
import defpackage.C2336l;
import defpackage.C7598l;
import defpackage.C8195l;
import defpackage.C8895l;
import defpackage.InterfaceC13922l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR/\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R;\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\u001eR/\u0010*\u001a\u0004\u0018\u00010$2\b\u0010\f\u001a\u0004\u0018\u00010$8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u000e\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u00101\u001a\u00020+2\u0006\u0010\f\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R/\u00108\u001a\u0004\u0018\u0001022\b\u0010\f\u001a\u0004\u0018\u0001028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u000e\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010?\u001a\u0002092\u0006\u0010\f\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u000e\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getStatusBarHeight", "()I", "<set-?>", "lٌؘؒ", "Llْۖؓ;", "getAnchorView", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "anchorView", "", "lؗۤؑ", "getAnchorViewList", "()Ljava/util/List;", "setAnchorViewList", "(Ljava/util/List;)V", "anchorViewList", "lؓٝؕ", "getOverlayColor", "setOverlayColor", "(I)V", "overlayColor", "lٍۥۗ", "getOverlayPaddingColor", "setOverlayPaddingColor", "overlayPaddingColor", "Landroid/graphics/Shader;", "lٍۣۢ", "getOverlayPaddingShader", "()Landroid/graphics/Shader;", "setOverlayPaddingShader", "(Landroid/graphics/Shader;)V", "overlayPaddingShader", "Llؚۣؐ;", "lَٕ۠", "getOverlayPadding", "()Llؚۣؐ;", "setOverlayPadding", "(Llؚۣؐ;)V", "overlayPadding", "Landroid/graphics/Point;", "lؓۡؑ", "getOverlayPosition", "()Landroid/graphics/Point;", "setOverlayPosition", "(Landroid/graphics/Point;)V", "overlayPosition", "Llًؗۚ;", "lؕؕؒ", "getBalloonOverlayShape", "()Llًؗۚ;", "setBalloonOverlayShape", "(Llًؗۚ;)V", "balloonOverlayShape", "balloon_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BalloonAnchorOverlayView extends View {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f781l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters and from kotlin metadata */
    public final C13568l overlayColor;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters and from kotlin metadata */
    public final C13568l overlayPosition;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters and from kotlin metadata */
    public final C13568l balloonOverlayShape;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters and from kotlin metadata */
    public final C13568l anchorViewList;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters and from kotlin metadata */
    public final C13568l anchorView;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Paint f787l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters and from kotlin metadata */
    public final C13568l overlayPaddingShader;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters and from kotlin metadata */
    public final C13568l overlayPaddingColor;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f790l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Bitmap f791l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters and from kotlin metadata */
    public final C13568l overlayPadding;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final Paint f793l;

    static {
        C0114l c0114l = new C0114l(BalloonAnchorOverlayView.class, "anchorView", "getAnchorView()Landroid/view/View;", 0);
        C2336l c2336l = AbstractC18202l.yandex;
        f781l = new InterfaceC13922l[]{c2336l.billing(c0114l), c2336l.billing(new C0114l(BalloonAnchorOverlayView.class, "anchorViewList", "getAnchorViewList()Ljava/util/List;", 0)), c2336l.billing(new C0114l(BalloonAnchorOverlayView.class, "overlayColor", "getOverlayColor()I", 0)), c2336l.billing(new C0114l(BalloonAnchorOverlayView.class, "overlayPaddingColor", "getOverlayPaddingColor()I", 0)), c2336l.billing(new C0114l(BalloonAnchorOverlayView.class, "overlayPaddingShader", "getOverlayPaddingShader()Landroid/graphics/Shader;", 0)), c2336l.billing(new C0114l(BalloonAnchorOverlayView.class, "overlayPadding", "getOverlayPadding()Lcom/skydoves/balloon/BalloonOverlayPadding;", 0)), c2336l.billing(new C0114l(BalloonAnchorOverlayView.class, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;", 0)), c2336l.billing(new C0114l(BalloonAnchorOverlayView.class, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", 0))};
    }

    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.anchorView = AbstractC15684l.mopub(this, null);
        this.anchorViewList = AbstractC15684l.mopub(this, null);
        this.overlayColor = AbstractC15684l.mopub(this, 0);
        this.overlayPaddingColor = AbstractC15684l.mopub(this, 0);
        this.overlayPaddingShader = AbstractC15684l.mopub(this, null);
        this.overlayPadding = AbstractC15684l.mopub(this, new C7598l());
        this.overlayPosition = AbstractC15684l.mopub(this, null);
        this.balloonOverlayShape = AbstractC15684l.mopub(this, C11428l.yandex);
        Paint paint = new Paint(1);
        this.f787l = paint;
        Paint paint2 = new Paint(1);
        this.f793l = paint2;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
    }

    private final int getStatusBarHeight() {
        Rect rect = new Rect();
        Activity activityLoadAd = AbstractC9968l.loadAd(getContext());
        if (activityLoadAd == null) {
            return 0;
        }
        activityLoadAd.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View anchorView;
        View anchorView2;
        Bitmap bitmap;
        if ((this.f790l || (bitmap = this.f791l) == null || bitmap.isRecycled()) && getWidth() != 0 && getHeight() != 0 && (((anchorView = getAnchorView()) == null || anchorView.getWidth() != 0) && ((anchorView2 = getAnchorView()) == null || anchorView2.getHeight() != 0))) {
            Bitmap bitmap2 = this.f791l;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f791l = bitmapCreateBitmap;
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
            Paint paint = this.f787l;
            paint.setXfermode(porterDuffXfermode);
            paint.setColor(getOverlayColor());
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setColor(0);
            int overlayPaddingColor = getOverlayPaddingColor();
            Paint paint2 = this.f793l;
            paint2.setColor(overlayPaddingColor);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(getOverlayPadding().loadAd);
            paint2.setShader(getOverlayPaddingShader());
            List<View> anchorViewList = getAnchorViewList();
            if (anchorViewList == null || anchorViewList.isEmpty()) {
                yandex(getAnchorView(), canvas2);
            } else {
                List<View> anchorViewList2 = getAnchorViewList();
                if (anchorViewList2 != null) {
                    Iterator<T> it = anchorViewList2.iterator();
                    while (it.hasNext()) {
                        yandex((View) it.next(), canvas2);
                    }
                }
            }
            this.f790l = false;
        }
        Bitmap bitmap3 = this.f791l;
        if (bitmap3 == null || bitmap3.isRecycled()) {
            return;
        }
        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
    }

    public final View getAnchorView() {
        InterfaceC13922l interfaceC13922l = f781l[0];
        return (View) this.anchorView.f26580l;
    }

    public final List<View> getAnchorViewList() {
        InterfaceC13922l interfaceC13922l = f781l[1];
        return (List) this.anchorViewList.f26580l;
    }

    public final AbstractC4755l getBalloonOverlayShape() {
        InterfaceC13922l interfaceC13922l = f781l[7];
        return (AbstractC4755l) this.balloonOverlayShape.f26580l;
    }

    public final int getOverlayColor() {
        InterfaceC13922l interfaceC13922l = f781l[2];
        return ((Number) this.overlayColor.f26580l).intValue();
    }

    public final C7598l getOverlayPadding() {
        InterfaceC13922l interfaceC13922l = f781l[5];
        return (C7598l) this.overlayPadding.f26580l;
    }

    public final int getOverlayPaddingColor() {
        InterfaceC13922l interfaceC13922l = f781l[3];
        return ((Number) this.overlayPaddingColor.f26580l).intValue();
    }

    public final Shader getOverlayPaddingShader() {
        InterfaceC13922l interfaceC13922l = f781l[4];
        return (Shader) this.overlayPaddingShader.f26580l;
    }

    public final Point getOverlayPosition() {
        InterfaceC13922l interfaceC13922l = f781l[6];
        return (Point) this.overlayPosition.f26580l;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f790l = true;
    }

    public final void setAnchorView(View view) {
        this.anchorView.tapsense(f781l[0], view);
    }

    public final void setAnchorViewList(List<? extends View> list) {
        this.anchorViewList.tapsense(f781l[1], list);
    }

    public final void setBalloonOverlayShape(AbstractC4755l abstractC4755l) {
        this.balloonOverlayShape.tapsense(f781l[7], abstractC4755l);
    }

    public final void setOverlayColor(int i) {
        this.overlayColor.tapsense(f781l[2], Integer.valueOf(i));
    }

    public final void setOverlayPadding(C7598l c7598l) {
        this.overlayPadding.tapsense(f781l[5], c7598l);
    }

    public final void setOverlayPaddingColor(int i) {
        this.overlayPaddingColor.tapsense(f781l[3], Integer.valueOf(i));
    }

    public final void setOverlayPaddingShader(Shader shader) {
        this.overlayPaddingShader.tapsense(f781l[4], shader);
    }

    public final void setOverlayPosition(Point point) {
        this.overlayPosition.tapsense(f781l[6], point);
    }

    public final void yandex(View view, Canvas canvas) {
        RectF rectF;
        if (view != null) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            rect.offset((int) view.getTranslationX(), (int) view.getTranslationY());
            Point overlayPosition = getOverlayPosition();
            if (overlayPosition != null) {
                rectF = new RectF(overlayPosition.x - getOverlayPadding().yandex, (overlayPosition.y - getOverlayPadding().loadAd) + getStatusBarHeight(), view.getWidth() + overlayPosition.x + getOverlayPadding().crashlytics, view.getHeight() + overlayPosition.y + getOverlayPadding().amazon + getStatusBarHeight());
            } else {
                rectF = new RectF(rect.left - getOverlayPadding().yandex, rect.top - getOverlayPadding().loadAd, rect.right + getOverlayPadding().crashlytics, rect.bottom + getOverlayPadding().amazon);
            }
            float f = getOverlayPadding().loadAd / 2.0f;
            float f2 = getOverlayPadding().amazon;
            float f3 = getOverlayPadding().yandex / 2.0f;
            float f4 = getOverlayPadding().crashlytics;
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(f3, f);
            AbstractC4755l balloonOverlayShape = getBalloonOverlayShape();
            boolean z = balloonOverlayShape instanceof C11428l;
            Paint paint = this.f793l;
            Paint paint2 = this.f787l;
            if (z) {
                canvas.drawOval(rectF, paint2);
                canvas.drawOval(rectF2, paint);
            } else {
                if (!(balloonOverlayShape instanceof C8895l)) {
                    C18725l.billing();
                    return;
                }
                C8195l c8195l = ((C8895l) balloonOverlayShape).yandex;
                Object obj = c8195l.f17097l;
                Number number = (Number) c8195l.f17098l;
                Number number2 = (Number) obj;
                canvas.drawRoundRect(rectF, number.floatValue(), number2.floatValue(), paint2);
                canvas.drawRoundRect(rectF2, number.floatValue() - (getOverlayPadding().yandex / 2.0f), number2.floatValue() - (getOverlayPadding().loadAd / 2.0f), paint);
            }
        }
    }

    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BalloonAnchorOverlayView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i, int i2, AbstractC1753l abstractC1753l) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
